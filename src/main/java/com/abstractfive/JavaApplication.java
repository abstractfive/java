package com.abstractfive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class JavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello() {
		return "hello nmsl 李子宁 ";
	}
}
