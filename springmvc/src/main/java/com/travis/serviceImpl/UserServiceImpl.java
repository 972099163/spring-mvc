package com.travis.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.travis.mapper.UserMapper;
import com.travis.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserMapper mapper;
	
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		mapper.deleteById(id);
	}
	
}
