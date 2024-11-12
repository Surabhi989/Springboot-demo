package com.example.user.service;

import org.springframework.stereotype.Service;

import com.example.user.model.User;

@Service
public class UserService {

	public User getUserById(Long id) {
		return new User(id, "Surabhi", "surabhi98@gmail.com");
	}

}