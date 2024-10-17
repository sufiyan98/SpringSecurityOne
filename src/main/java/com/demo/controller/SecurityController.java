package com.demo.controller;

import org.springframework.security.access.event.PublicInvocationEvent;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class SecurityController {
@GetMapping("/")
public String welcomeuser() {
	return "Welcome";
}

@GetMapping("/user")
	public String hellouser() {
		return "Welcome user";
	}

@GetMapping("/admin")
public String helloadmin() {
	return "Welcome admin";
}
}


