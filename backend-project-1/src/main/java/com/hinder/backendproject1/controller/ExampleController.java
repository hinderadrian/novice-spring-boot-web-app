package com.hinder.backendproject1.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hinder.backendproject1.model.Person;

@Controller
@RequestMapping("/example")
public class ExampleController {
	
	public static final String EXAMPLE_VIEW = "example";

	//primera forma
	//@RequestMapping(value = "/exampleString", method = RequestMethod.GET) --Esta es la manera anterior
	@GetMapping("/exampleString")
	public String exampleString(Model model) {
		model.addAttribute("people", getPeople());
		return EXAMPLE_VIEW;
	}
	
	//segunda forma
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV() {
		ModelAndView mav = new ModelAndView("example");
		//mav.addObject("person", new Person("María Camila", 21));
		mav.addObject("people", getPeople());
		return mav;
	}
	
	private List<Person> getPeople() {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Andrés Caicedo", 27));
		people.add(new Person("Charles Butkowski", 67));
		people.add(new Person("Julio cortazar", 80));
		people.add(new Person("Andrés Oppenheimer", 61));
		people.add(new Person("Mario Mendoza", 49));
		
		return people;
	}
	
}
