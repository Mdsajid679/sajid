package com.ninja.springboot_app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping("/test")
	public String test()
	{
		return "hello Springboot app";
	}
	@RequestMapping("/home")
	public String home()
	{
		return "welcome to my page";
	}

}
