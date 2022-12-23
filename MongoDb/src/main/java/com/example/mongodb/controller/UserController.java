package com.example.mongodb.controller;


import com.example.mongodb.model.User;
import com.example.mongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {

	@Autowired
	UserRepository userRepo;

	@GetMapping("/users")
	public List<User> findAllUsers() {
		return userRepo.findAll();
	}
}
