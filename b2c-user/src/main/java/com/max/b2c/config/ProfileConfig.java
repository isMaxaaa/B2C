package com.max.b2c.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@EnableTransactionManagement
@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
public class ProfileConfig {

    private String username;

    private String password;

    private String url;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 创建test数据源
     * @return
     * @throws Exception
     */
    @Bean
    @Primary
    public DataSource druidDataSource(){
        DruidDataSource datasource = new DruidDataSource();

        datasource.setUrl(url);
        datasource.setUsername(username);
        datasource.setPassword(password);


        return datasource;
    }


    /**
     * mybatis的事务管理器，数据错误等操作可以回滚
     * @return
     * @throws Exception
     */
    @Bean
    public PlatformTransactionManager platformTransactionManager() throws Exception{
        return new DataSourceTransactionManager(druidDataSource());
    }

}
