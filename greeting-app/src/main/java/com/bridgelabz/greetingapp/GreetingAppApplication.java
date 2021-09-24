package com.bridgelabz.greetingapp;

import com.bridgelabz.greetingapp.controller.GreetingController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GreetingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingAppApplication.class, args);
		// System.out.println(context.getBean(GreetingController.class));
	}

}