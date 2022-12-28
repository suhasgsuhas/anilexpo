package com.Base;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hai")
public class HeyController {
	
	 public HeyController() {
		 System.out.println("Hey are u Controller");
	 }
	 @RequestMapping("/in")
  public ModelAndView watch() {
	 System.out.println("User Page Requested");
	 ModelAndView model= new ModelAndView();
	 model.setViewName("test");
	 return model;
	 
}
	 @RequestMapping("/out")
	 public ModelAndView rodio(@RequestParam Map<String ,String> data) {
		 System.out.println("requested to server");
		 ModelAndView model= new ModelAndView();
			model.addObject("user",data.get("user"));
			model.addObject("pass",data.get("pass"));
			
			model.setViewName("mock");
			return model;
		   }
		 }
		 
		 
	 
	 
	 
	 

	
		
