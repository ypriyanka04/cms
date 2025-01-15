package com.citi.pki_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.citi")
@EntityScan(basePackages = "com.citi")
//@EnableJpaRepositories(basePackages = "com.citi")
public class PkiServiceApplication{

	public static void main(String[] args) {
		SpringApplication.run(PkiServiceApplication.class,args);
	}

}
