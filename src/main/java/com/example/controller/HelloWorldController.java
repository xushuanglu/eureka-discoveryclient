package com.example.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
@Component
public class HelloWorldController {

	@GetMapping(value = "/hello")
	public String index() {
		return "Hello World";
	}

}
