package com.travis.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.travis.service.UserService;

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/deleteById")
	public String deleteById(int id,HttpServletRequest request)
	{
		
		userService.deleteById(id);
		return "ok";
	}
}
