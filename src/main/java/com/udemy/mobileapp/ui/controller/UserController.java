package com.udemy.mobileapp.ui.controller;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
	
	@GetMapping
	public String getUser(@RequestParam(value = "page")int page,
			@RequestParam(value = "limit")int limit) {
		return "hello users "  + page + "and" + limit;
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
