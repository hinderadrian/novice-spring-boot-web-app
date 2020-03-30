package com.hinder.backendproject1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example2")
public class Example2Controller {

	//localhost:8084/example2/request1?nm=Hinder
	@GetMapping("/request1")
	public ModelAndView request1(@RequestParam(name = "nm", required=false, defaultValue="NULL") String name) {
		ModelAndView mav = new ModelAndView("example2");
		mav.addObject("name_in_model", name);
		
		return mav;
		
	}
	
}
