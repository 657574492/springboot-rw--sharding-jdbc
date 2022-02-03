package com.example.controller;


import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/findUser")
	public List<User> findUser() {
		return userService.findUser();
	}

	@RequestMapping("/user")
	public User queryById(String userName) {
		return userService.queryById(16L);
	}
	@RequestMapping("/user/insert")
	public Boolean insertUser(String userName) {
		return userService.insert(16L);
	}
}
