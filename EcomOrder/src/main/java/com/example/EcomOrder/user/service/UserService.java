package com.example.EcomOrder.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcomOrder.user.dao.UserRepository;
import com.example.EcomOrder.user.dto.UserResponse;
import com.example.EcomOrder.user.dto.UserSignupRequest;
import com.example.EcomOrder.user.entity.User;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	 public UserResponse register(UserSignupRequest request) {
	        // Check if email already exists
	        //if (userRepository.existsByEmail(request.getEmail())) {
	         //   throw new RuntimeException("Email already in use");
	        //}

	        // Map DTO to Entity
	        User user = new User();
	        user.setEmail(request.getEmail());
	        user.setId(Long.valueOf(request.getUserId()));
	       // user.setPasswordHash(passwordEncoder.encode(request.getPassword()));
	        user.setPasswordHash(request.getPassword());
	        user.setRoles("ROLE_USER"); // default role
	       // user.setCreatedAt(java.time.Instant.now());

	        // Save user
	        User saved = userRepository.save(user);

	        // Map Entity to Response DTO
	        UserResponse response = new UserResponse();
	        response.setId(saved.getId());
	        response.setEmail(saved.getEmail());
	        response.setRoles(saved.getRoles());

	        return response;
	    }

}
