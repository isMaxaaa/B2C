package com.max.b2c;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//(scanBasePackages = "com.max.b2c")
@SpringBootApplication(scanBasePackages = "com.max.b2c.*")
public class UserApplicaton {
    public static void main(String[] args) {
        SpringApplication.run(UserApplicaton.class,args);
    }
}
