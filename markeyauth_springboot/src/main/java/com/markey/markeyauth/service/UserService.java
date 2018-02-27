package com.markey.markeyauth.service;

import java.util.List;

import com.markey.markeyauth.domain.User;

public interface UserService {

	public List<User> findAll();
	public User findUser(Long id);
	public void saveUser(User user);
	public void deleteUser(Long id);
	public List<User> findUserByUsername(String username);
}
