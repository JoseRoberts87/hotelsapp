package com.joseroberts87.hotelsapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class HotelsApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(HotelsApplication.class, args);
	}
}
