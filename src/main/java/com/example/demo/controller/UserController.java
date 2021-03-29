package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Users;
import com.example.demo.repo.UserRepo;

@RestController
public class UserController {

	@Autowired
	private UserRepo repo;

	@GetMapping("/getUsers")
	public List<Users> getUsers() {

		List<Users> users = new ArrayList<>();
		users = repo.findAll();
		return users;
	}

	@PostMapping("/addUsers")
	public String addUsers(Users u) {
		repo.save(u);
		return "Saved";
	}

}
