package com.elk.ELK.Demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeApi {
	
	@GetMapping(value="/api/welcome")
	public String welcome() {
		
		return "Welcome to Spring Boot ELK demo";
	}

}
