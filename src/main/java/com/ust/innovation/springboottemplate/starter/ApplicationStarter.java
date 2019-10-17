package com.ust.innovation.springboottemplate.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationStarter {
	
	public static void main(String args[]) {
		
		System.out.println("Entered application starter");
		SpringApplication.run(ApplicationStarter.class, args);
	}

}
