package com.example.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import javax.inject.Inject;

@SpringBootApplication
public class JpaDemoApplication {

	@Inject
	private Environment env;

	public static void main(String[] args) {



		SpringApplication.run(JpaDemoApplication.class, args);
	}

}
