package com.chandra.jenkin.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public void methodd(){
		logger.info("Application execution started..!!");
	}
	public static void main(String[] args) {
		logger.info("Application executed..!!");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
