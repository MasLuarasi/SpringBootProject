package com.example.springbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@RestController
//@SpringBootApplication
@ComponentScan({"com.example.springbootproject.service"})
@EntityScan("com.delivery.domain")
@EnableJpaRepositories("com.example.springbootproject.repository")
public class SpringBootProjectApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(SpringBootProjectApplication.class, args);
    }

}