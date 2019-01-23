package com.travis.service;

import org.springframework.stereotype.Component;

@Component
public interface UserService {
	
	public void deleteById(int id);
}
