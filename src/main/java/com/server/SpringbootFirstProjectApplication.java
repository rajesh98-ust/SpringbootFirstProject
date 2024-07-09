package com.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringbootFirstProjectApplication {
	
	static Logger log=LoggerFactory.getLogger(SpringbootFirstProjectApplication.class);
	
	@PostConstruct
	public void message() {
		log.info("Rajesh Kumar ddd");
	}

	public static void main(String[] args) {
		log.info("Rajesh Kumar First jenkins ");
		SpringApplication.run(SpringbootFirstProjectApplication.class, args);
	}

}
