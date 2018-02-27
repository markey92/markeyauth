package com.markey.markeyauth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.markey.markeyauth.domain.User;
import com.markey.markeyauth.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/")
    public List<User> getAllUser()
    {
        List<User> users = userService.findAll();
        return users;
    }
}
