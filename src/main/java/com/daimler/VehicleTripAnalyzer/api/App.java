package com.daimler.VehicleTripAnalyzer.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestOperations;


@SpringBootApplication
public class App 
{
    public static void main(final String[] args )
    {
    	 SpringApplication.run(App.class, args);
    }
    
    
    
    /*@Bean
    RestOperations restTemplateBuilder(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder.basicAuthentication("username", "password").build();
    }*/
}
