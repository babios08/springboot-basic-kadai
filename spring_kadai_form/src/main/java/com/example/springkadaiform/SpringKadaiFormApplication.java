package com.example.springkadaiform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringKadaiFormApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringKadaiFormApplication.class, args);
    }
}
