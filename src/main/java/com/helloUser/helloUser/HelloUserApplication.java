package com.helloUser.helloUser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloUserApplication {

	public static Group group = new Group("NWO Knitting Circle");

	public static void main(String[] args) {
		SpringApplication.run(HelloUserApplication.class, args);
	}

}
