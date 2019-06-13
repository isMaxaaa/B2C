package com.max.b2c.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.*;


@Configuration
@EnableTransactionManagement
@MapperScan({"com.max.b2c.mapper","com.max.b2c.dao"})
public class MybatisConfig {

}
