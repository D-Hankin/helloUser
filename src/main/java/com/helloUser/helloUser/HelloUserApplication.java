package com.helloUser.helloUser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloUserApplication {

	public static Group group = new Group("NWO Knitting Circle");

	static {
		group.addMember("David", "1", "Human", "d@d.com");
		group.addMember("Scllarr", "2", "Reptilian", "r@r.com");
		group.addMember("Scytale", "3", "Tleilaxu", "d@d.com");
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloUserApplication.class, args);
	}

}
