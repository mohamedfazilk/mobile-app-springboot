package com.udemy.mobileapp.ui.controller;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
	
	@GetMapping
	public String getUser() {
		return "hello users";
	}
	
	@PostMapping
	public String createUser() {
		return "create users";
	}
	
	@PutMapping
	public String updateUsers() {
		return "update users";
	}
	
	@DeleteMapping
	public String deleteUsers() {
		return "delte users";
	}

}
