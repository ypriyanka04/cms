package com.citi.credentials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.citi")
@EntityScan(basePackages = "com.citi")
//@EnableJpaRepositories(basePackages = "com.citi")
public class CredentialsApplication{

	public static void main(String[] args) {
		SpringApplication.run(CredentialsApplication.class,args);
	}

}
