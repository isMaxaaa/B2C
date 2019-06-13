package com.max.b2c.config;

import com.max.b2c.util.CustomCacheManager;
import com.max.b2c.util.CustomRealm;
import com.max.b2c.util.CustomSessionManager;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.mgt.DefaultSessionStorageEvaluator;
import org.apache.shiro.mgt.DefaultSubjectDAO;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.session.mgt.eis.EnterpriseCacheSessionDAO;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import javax.servlet.Filter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Slf4j
@Configuration
public class ShiroConfig {

    @Bean
    public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean=new ShiroFilterFactoryBean();

        // 添加自己的过滤器取名为jwt,shiro结合jwt


        //设置SecurityManager
        shiroFilterFactoryBean.setSecurityManager(securityManager);

        //设置拦截器
        Map<String,String> filterChainDefinitionMap=new LinkedHashMap<>();

        //所有请求先经过自定义的过滤器
        filterChainDefinitionMap.put("/**","jwt");

         //设置登录url
        shiroFilterFactoryBean.setLoginUrl("/user/login");

        //设置无权限地跳转url
        shiroFilterFactoryBean.setUnauthorizedUrl("/user/unauthorize");


        //开放登录接口
      // filterChainDefinitionMap.put("/swagger-ui.html","anon");
       // filterChainDefinitionMap.put("/user/login","anon");

        //其他接口一律认证，顺序不可以颠倒
        filterChainDefinitionMap.put("/user/**","authc");
        Map<String, Filter> filterMap = new HashMap<>();
        filterMap.put("jwt", new JwtFilter());
        shiroFilterFactoryBean.setFilters(filterMap);


        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        log.info("Shiro拦截器工厂类注入成功");

        return shiroFilterFactoryBean;
    }

    @Bean
    public SecurityManager securityManager(){
        DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager();
        //设置realm
        securityManager.setRealm(myRealm());
        // 关闭Shiro自带的session
        DefaultSubjectDAO subjectDAO = new DefaultSubjectDAO();
        DefaultSessionStorageEvaluator defaultSessionStorageEvaluator = new DefaultSessionStorageEvaluator();
        defaultSessionStorageEvaluator.setSessionStorageEnabled(false);
        subjectDAO.setSessionStorageEvaluator(defaultSessionStorageEvaluator);
       securityManager.setSubjectDAO(subjectDAO);
        // 设置自定义Cache缓存
       securityManager.setCacheManager(new CustomCacheManager());
        return securityManager;
    }

    //自定义身份认证realm
    @Bean
    public CustomRealm myRealm() {
          return new CustomRealm();
    }

    @Bean
    @DependsOn("lifecycleBeanPostProcessor")
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        // 强制使用cglib，防止重复代理和可能引起代理出错的问题，https://zhuanlan.zhihu.com/p/29161098
        defaultAdvisorAutoProxyCreator.setProxyTargetClass(true);
        return defaultAdvisorAutoProxyCreator;
    }

//    @Bean
//    public SessionManager sessionManager(){
//        CustomSessionManager customSessionManager=new CustomSessionManager();
//        /*使用了shiro自带缓存，
//		如果设置 redis为缓存需要重写CacheManager（其中需要重写Cache）
//		manager.setCacheManager(this.RedisCacheManager());*/
//        customSessionManager.setSessionDAO(new EnterpriseCacheSessionDAO());
//        //取消url后面的JSESSIONID
//        customSessionManager.setSessionIdUrlRewritingEnabled(false);
//        return customSessionManager;
//    }

    @Bean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }

    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(DefaultWebSecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor advisor = new AuthorizationAttributeSourceAdvisor();
        advisor.setSecurityManager(securityManager);
        return advisor;
    }

}
