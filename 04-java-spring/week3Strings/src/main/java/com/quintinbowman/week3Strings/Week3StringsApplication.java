package com.quintinbowman.week3Strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Week3StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week3StringsApplication.class, args);
	}
	@RequestMapping("/")
	public String index() {
		return "Hello World, witness my coding greatness";
	}
	@RequestMapping("/random")
	public String Random() {
		return "Spring Boot is great, I'm finally getting the hang of it.";
	}
}