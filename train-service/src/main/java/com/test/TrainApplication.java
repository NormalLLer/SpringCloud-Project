package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;

@SpringBootApplication
@EnableAutoDataSourceProxy
public class TrainApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrainApplication.class, args);
    }

}
