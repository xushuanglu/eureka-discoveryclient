package com.example.controller;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.netflix.discovery.DiscoveryClient;

@EnableAutoConfiguration
@RestController
@Component
public class HelloWorldController {
	
//	private final Logger logger = Logger.getLogger(getClass());
//	
//	@Autowired
//	private DiscoveryClient client;
	

	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public String index() {
		return "Hello World";
	}

}
