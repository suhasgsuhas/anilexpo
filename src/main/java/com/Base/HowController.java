package com.Base;

import java.util.HashMap;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller

@RequestMapping("/hello")
public class HowController {
	 public HowController() {
		 System.out.println("How are u Controller");
	 }
	static HashMap<String,Customer> map = new  HashMap<>();
	static {
		Customer c1= new Customer("10","tom","rider","tom@gmail.com");
		Customer c2= new Customer("20","jack","batman","jack@gmail.com");
		Customer c3= new Customer("30","robert","antman","robert@gmail.com");
		Customer c4= new Customer("40","master","spiderman","master@gmail.com");
		map.put(c1.getId(), c1);
		map.put(c2.getId(), c2);
		map.put(c3.getId(), c3);
		map.put(c4.getId(), c4);
	}

 @RequestMapping("/in")
 public ModelAndView some()
 {
	 System.out.println("login called");
	 ModelAndView model= new ModelAndView();
	 model.setViewName("form");
	 return model;
 }
 @RequestMapping("/out")
 public ModelAndView and(@RequestParam Map<String, String> data)
 {
		System.out.println("submit method has been called");
		ModelAndView model = new ModelAndView();
		String userid=data.get("id");
		String username=data.get("name");
		String userpassword=data.get("password");
		String useremail=data.get("email");
		
		Customer cust = map.get(userid);
		
		if(map.containsKey(userid))
		{
			if(!username.equals(cust.getName())) {
				model.addObject("msg1", "wrong username");
			}
			if(!userpassword.equals(cust.getPassword()))
			{
				model.addObject("msg2", "wrong password");
			}
			if(!useremail.equals(cust.getEmail()))
			{
				model.addObject("msg3", "wrong email");
			}
			else
			{
				model.addObject("msg1", userid);
				model.addObject("msg2", username);
				model.addObject("msg3", userpassword);
				model.addObject("msg4",useremail);
			}
		
		}
		else
		{
			model.addObject("msg4","invalid user id");
		}
		model.setViewName("backspace");
		return model;
 }
		

 }
 

