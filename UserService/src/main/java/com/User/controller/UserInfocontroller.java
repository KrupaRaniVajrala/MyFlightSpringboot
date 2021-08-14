package com.User.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.User.entities.UserInfoEntity;
import com.User.service.UserInfoService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v3/")
public class UserInfocontroller {

	@Autowired
	
	UserInfoService service;
	
	@GetMapping("users")
	@Cacheable(value="users")
	public List<UserInfoEntity> findUsers() {
		System.out.println("User By ID from DB");
		return service.findUsers();
	}
	
	@GetMapping("userbyname/{name}")

	public UserInfoEntity findUserByName(@PathVariable String name) {
		System.out.println("All users from db");
		return service.findUserByName(name);
	}
	

	@GetMapping("users/{id}")
	@Cacheable(key="#id",value="users",condition="#id==5")
	public UserInfoEntity findUserById(@PathVariable long id) {
		System.out.println("User By ID from DB");
		return service.findUserById(id);
	}

	@PostMapping("users")
	public UserInfoEntity saveUser(@RequestBody UserInfoEntity user) {
		System.out.println("User details saved" + user);
		return service.saveUser(user);
	}
	
	
	@DeleteMapping("users/{id}")
	@CacheEvict(key="#id",value="users")
	public String deleteUser(@PathVariable long id)
	{
		service.deleteUser(id);
		return "deleted";
	}
}
