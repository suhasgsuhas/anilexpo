package com.jspiders.controller;

import java.util.HashMap;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/login")
public class ByeController {
	static Map<String, String> h1 = new HashMap<String, String>();
	
	public ByeController() {
		System.out.println("I am hello Controller");
	}

	@RequestMapping(value = "/in")
	public ModelAndView anything() {
		 System.out.println("User Page Requested");
		ModelAndView model = new ModelAndView();
		model.setViewName("mort");
		return model;
	}

	@RequestMapping(value = "/out")
	public ModelAndView sometimes(@RequestParam Map<String, String> data) {
		System.out.println("submit method has been called");
		ModelAndView model = new ModelAndView();
		h1.put("tom", "rider");
		h1.put("jerry", "batman");
		h1.put("jack", "antman");
		h1.put("aliean", "spidernam");
		if((h1.containsKey(data.get("userName"))))
				{
			if((h1.get(data.get("userName")).equals(data.get("password")))){
				model.addObject("user", data.get("userName"));
				model.addObject("pass", data.get("password"));
				model.addObject("email", data.get("email"));
				model.addObject("msg", "welcome to college");
			}
			else
				model.addObject("msg", "worng password");

				}
		else
			model.addObject("user", "worng student name");

		model.setViewName("backspace");
		return model;
	}

}