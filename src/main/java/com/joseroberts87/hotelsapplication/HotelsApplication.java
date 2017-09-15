package com.joseroberts87.hotelsapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
//@ComponentScan({"com.joseroberts87.hotelsapplication.controllers"})
//@EntityScan("com.joseroberts87.hotelsapplication.models")
public class HotelsApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(HotelsApplication.class, args);
	}
}
