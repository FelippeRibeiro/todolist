package com.felipe.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodolistApplication {

	public static void main(String[] args) {
		System.out.println("Starting TodoList aplication");
		SpringApplication.run(TodolistApplication.class, args);
	}

}
