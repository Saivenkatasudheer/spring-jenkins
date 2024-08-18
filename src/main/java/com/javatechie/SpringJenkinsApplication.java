package com.javatechie;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@PostConstruct
	public void initMethod(){
		logger.info("execute before Application starts");
	}
	
	public static void main(String[] args) {
		logger.info("execute while Application starts");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
