package com.hinder.backendproject1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/say")
public class HelloWorldController {

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "helloWorld";
	}
	
}
