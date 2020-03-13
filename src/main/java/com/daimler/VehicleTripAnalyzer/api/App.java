package com.daimler.VehicleTripAnalyzer.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@SpringBootApplication
@RestController
public class App 
{
    public static void main(final String[] args )
    {
    	 SpringApplication.run(App.class, args);
    }
    
    @RequestMapping(value = "/")
	public String trip1() {
		
		return "It's working"; 
	}
}
