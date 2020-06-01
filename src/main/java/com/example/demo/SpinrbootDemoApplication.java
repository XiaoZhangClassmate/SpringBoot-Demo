package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.example.demo.dao")
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class SpinrbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpinrbootDemoApplication.class, args);
    }

}
