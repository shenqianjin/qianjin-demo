package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		if (System.currentTimeMillis() % 2 >= 0) {
			throw new RuntimeException("test boot error in spring boot application.");
		}
		SpringApplication.run(DemoApplication.class, args);
	}

}
