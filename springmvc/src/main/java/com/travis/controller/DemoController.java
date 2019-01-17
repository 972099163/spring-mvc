package com.travis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demoController")
@ResponseBody
public class DemoController {
	@RequestMapping("/demo")
	public String index()
	{
		return "SpringMVCúy‘á";
	}
}
