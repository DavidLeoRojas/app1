package com.example.taller1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class app1 {
	@RequestMapping("/hola")
	public static void main(String[] args) {

		SpringApplication.run(app1.class, args);
	}

}
