package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo"})
//@EntityScan(basePackages = {"com.example.demo.entities"} )
//@EnableJpaRepositories(basePackages = {"com.examples.demo.repositories"})
//@EnableEncryptableProperties
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		//this white space change
		
		
		//testing git web hook changes
		
	}

}
