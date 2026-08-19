package com.wipro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/cicd")
@RestController
@SpringBootApplication
public class StatupProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(StatupProjectApplication.class, args);
	}
	@GetMapping
public String welcome()
{
	return "Welcome toCICD Pipeline";
}
}
