package com.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.entities.UserEntities;
import com.api.services.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;
	
	@RequestMapping(  method = RequestMethod.GET,path = "/hello")
	public String hello() {
		return "Hello World";
	}
	
	@PostMapping("/users")
	public void addUser(@RequestBody UserEntities user) {
		service.addUser(user);
	}
	
	@GetMapping("/users")
	public List<UserEntities> getAllUsers(){
		return service.getAllUsers();
	}
	
	@GetMapping("/user/{id}")
	public UserEntities getUser(@PathVariable int id) {
		return service.getUser(id);
	}	
	
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable int id) {
		service.deleteUser(id);
	}
}
