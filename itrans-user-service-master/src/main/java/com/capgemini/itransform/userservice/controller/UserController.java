package com.capgemini.itransform.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.itransform.userservice.entity.User;
import com.capgemini.itransform.userservice.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;
	
	@PostMapping("/user")
	public ResponseEntity<User> addNewUser(@RequestBody User user){
		return new ResponseEntity<User>(service.addNewUser(user),HttpStatus.OK);
	}
	
	@GetMapping("/user/{{userName}}")
	public ResponseEntity<User> getUserByUserName(@PathVariable String userName){
		return new ResponseEntity<User>(service.getUserByUserName(userName), HttpStatus.OK);
	}
}
