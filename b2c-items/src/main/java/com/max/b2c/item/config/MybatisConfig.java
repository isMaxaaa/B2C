package com.max.b2c.item.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan({"com.max.b2c.mapper","com.max.b2c.item.dao"})
@Configuration
@EnableTransactionManagement
public class MybatisConfig {

}
