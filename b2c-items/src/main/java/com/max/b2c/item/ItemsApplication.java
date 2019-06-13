package com.max.b2c.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//(scanBasePackages = "com.max.b2c.item")
@SpringBootApplication(scanBasePackages = "com.max.b2c")
public class ItemsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ItemsApplication.class,args);
    }
}
