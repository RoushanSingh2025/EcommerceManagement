package com.example.EcomOrder.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EcomOrder.user.dto.UserResponse;
import com.example.EcomOrder.user.dto.UserSignupRequest;
import com.example.EcomOrder.user.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/getUser")
	public String gerUAllUsers() {
		return "Test";
		
	}
	
	@PostMapping(consumes = "application/json",path="/createUser")
    public UserResponse signup(@Valid @RequestBody UserSignupRequest req) {
		
		userService.register(req);
		
        return new UserResponse();
    }

}
