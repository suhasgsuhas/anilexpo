package com.jspiders.controller;

import java.text.DateFormat;

import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jspiders.Service.TestService;
import com.jspiders.model.User;

@Controller
@RequestMapping("/bike")
public class HomeController {

	@Autowired
	private TestService  testany;
	
	public HomeController()
	{
		System.out.println("I am home controller");
	}
	
	
	
	@RequestMapping(value = "/hi")
	public ModelAndView user() {
		System.out.println("User Page Requested");
		ModelAndView model= new ModelAndView();
		testany.iammethod();
		model.setViewName("home");
		model.addObject("msg","welcome to IT HUB bangalore. Welcome to SPRING MVC anyway.");
		return model;
	}
		
//		@RequestMapping(value = "/laptop")
//		public ModelAndView test() {
//			System.out.println("User Page Requested");
//			ModelAndView model1= new ModelAndView();
//			
//			model1.setViewName("home");
//			model1.addObject("msg","TomCat run successfully");
//			return model1;
//	}
		
		

	

		
		
	
}
