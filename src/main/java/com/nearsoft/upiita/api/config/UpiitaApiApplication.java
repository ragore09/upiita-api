package com.nearsoft.upiita.api.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.nearsoft.upiita.api")
@EntityScan("com.nearsoft.upiita.api.model")
@EnableJpaRepositories("com.nearsoft.upiita.api.repository")
public class UpiitaApiApplication {

    public static void main(String [] args) {
        SpringApplication.run(UpiitaApiApplication.class, args);
    }
    
}
