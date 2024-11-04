package com.JekinDemo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeCont {
	
	@GetMapping("/welcome")
	public String getWelcome()
	{
		return "Welcome from controller";
	}

	@GetMapping("/test")
	public String test() {
    		return "Test endpoint is working!";
	}
	

}
