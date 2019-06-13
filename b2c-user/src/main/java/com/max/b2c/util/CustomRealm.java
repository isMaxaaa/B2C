package com.max.b2c.util;

import com.max.b2c.common.util.JedisUtil;
import com.max.b2c.component.JwtUtil;
import com.max.b2c.mapper.UserLoginMapper;

import com.max.b2c.model.UserLogin;
import com.max.b2c.model.UserLoginExample;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomRealm extends AuthorizingRealm {

    @Autowired(required = false)
    UserLoginMapper userLoginMapper;


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        return null;
    }

    @Override
    public boolean supports(AuthenticationToken authenticationToken) {
        return authenticationToken instanceof JwtToken;
    }


    /**
     * 获取身份验证信息
     * Shiro最终是通过Realm来验证登陆信息、角色、权限
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
//        UsernamePasswordToken token=(UsernamePasswordToken) authenticationToken;
//        //从数据库比对信息验证
//        UserLoginExample userLoginExample = new UserLoginExample();
//        userLoginExample.createCriteria().andUser_emailEqualTo(token.getUsername());
//        List<UserLogin> userLogins = userLoginMapper.selectByExample(userLoginExample);
//        UserLogin userLogin=userLogins.get(0);
//        if(userLogin==null)
//            throw new AccountException("账号无效，请重输");
//        else if(!userLogin.getUser_password().equals(new String((char[]) token.getCredentials())))
//            throw new AccountException("密码错误");
//
//        userLogin.setIs_logged((short) 1);
//        userLogin.setLogging_ip(111111);
//
//        //全部修改
//        int i = userLoginMapper.updateByPrimaryKeySelective(userLogin);
//
//        return new SimpleAuthenticationInfo(token.getPrincipal(),userLogin.getUser_password(),getName());
        String token = (String) authenticationToken.getCredentials();
        System.out.println(token);
        // 解密获得account，用于和数据库进行对比
        String account = JwtUtil.getClaim(token, "account");
        // 帐号为空
        if (StringUtils.isBlank(account)) {
            throw new AccountException("Token中帐号为空(The account in Token is empty.)");
        }

        UserLoginExample userLoginExample = new UserLoginExample();
        userLoginExample.createCriteria().andUser_emailEqualTo(account);
        List<UserLogin> userLogins = userLoginMapper.selectByExample(userLoginExample);
        UserLogin userLogin = userLogins.get(0);
        if (userLogin == null)
            throw new AccountException("账号无效，请重输");
        //认证，AccessToken认证通过，且Redis中存在RefreshToken，且两个Token时间戳一样
        if (JwtUtil.verify(token) && JedisUtil.exists("shiro:refresh_token:" + account)) {
            //获取RefreshToken的时间戳
            String currentTimeMillisRedis = JedisUtil.getObject("shiro:refresh_token:" + account).toString();
            //获取AccessToken时间戳，与RefreshToken的时间戳对比
            if (JwtUtil.getClaim(token, "currentTimeMillis").equals(currentTimeMillisRedis)) {

                return new SimpleAuthenticationInfo(token,token,getName());
            }

        }
        throw new AccountException("Token已过期(Token expired or incorrect.)");

    }
}
