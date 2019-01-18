package com.travis.mapper;

import com.travis.model.UserModel;

public interface UserMapper {
	public UserModel findById(int id);
	public void deleteById(int id);
}
