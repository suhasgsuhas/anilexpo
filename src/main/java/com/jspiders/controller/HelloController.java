package com.jspiders.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/maxi")
public class HelloController {

	public HelloController() {
		System.out.println("I am hello Controller");
	}

// @RequestMapping(value="/follow")
//   public ModelAndView india() {
//	 System.out.println("User Page Requested");
//	 ModelAndView model= new ModelAndView();
//	 model.setViewName("maxi");
//	 return model;
// }
// 

// @RequestMapping("submit")
// public ModelAndView something(@RequestParam("userName") String name) {
//	 System.out.println("submit method is called");
//	 ModelAndView model= new ModelAndView();
//	 model.addObject("msg", name);
//	 model.setViewName("home");
//	 
// return model;

	@RequestMapping(value = "/login")
	public ModelAndView request() {
		System.out.println("login page");
		ModelAndView loginobj = new ModelAndView();
		loginobj.setViewName("maxi");
		return loginobj;

	}
// @RequestMapping(value="/Password")
// public ModelAndView checking(@RequestParam("password") int password ) {
//	 System.out.println("in pwd class");
//	 ModelAndView model2= new ModelAndView();
//	 if(password==12345) 
//	 {
//	  model2.setViewName("if");
//	  model2.addObject("msg", "login succesful");
//	 }
//	 else
//	 {
//	  model2.setViewName("else");
//	  model2.addObject("msg", "password incorrect");
//	 }
//	 return model2;
// }

//@RequestMapping("submit")
//public ModelAndView something(@RequestParam Map<String ,String> data)
//{
//	System.out.println("submit method has been called");
//	 ModelAndView  model= new ModelAndView();
//	 
//	 if(data.get("password").equals("camlin")) {
//model.addObject("user", data.get("userName"));
//model.addObject("pass", data.get("password"));
//}
//	 else {
//		 model.addObject("msg", "user is unauthorized");
//		 
//	 }
//	 model.setViewName("backspace");
//	 return model;
//}

// @RequestMapping("submit")
// public ModelAndView anything(@RequestParam Map<String,String> data)
// {
//	 ModelAndView model = new ModelAndView();
//	 int c=0;
//
//	 String e = data.get("email");
//	 for(int i=0;i<e.length();i++)
//	 {
//		 if(e.charAt(i)=='@' && e.charAt(i)=='.')
//		 {
//			 c++;
//		 }
//
//	 }
//	 if(c==1  && data.get("password").equals("camlin"))
//	 {
//		 model.setViewName("backspace");
//		 model.addObject("msg", data.get("userName"));
//		 model.addObject("msg",data.get("password"));
//		 model.addObject("suhas", data.get("email"));
//	 		return model;
//	 }
//	 else
//	 {
//		 model.setViewName("backspace");
//		 model.addObject("msg","You are Unauthorized");
//		 return model;
//	 }
// }

//@RequestMapping("/submit")
//public ModelAndView any(@RequestParam Map<String, String> data)
//{
//	ModelAndView model= new ModelAndView();
//	String userName= data.get("userName");
//	String password=data.get("password");
//	String email= data.get("email");
//	if(!userName.equals("ben_stokes"))
//	{
//		model.addObject("msg", "invalid userName");
//	}
//	else if(!password.equals("England")) 
//	{
//		model.addObject("msg","invalid password");
//	}
//	else if(!(email.contains("@") && (email.contains("."))))
//	{
//		model.addObject("msg","invalid email-id");
//	}else{
//
//	
//		model.addObject("user", userName);
//		model.addObject("pass", password);
//		model.addObject("email", email);
//	}
//	model.setViewName("backspace");
//	return model;
//}

	@RequestMapping("/submit")
	public ModelAndView some(@RequestParam HashMap<String, String> data) {
		HashMap<String, String> map = new HashMap<>();
		ModelAndView model = new ModelAndView();
		map.put("Anil", "spiderman");
		map.put("varun", "batman");
		map.put("naveen", "antman");
		map.put("siddu", "rider");
		map.put("jagadesh", "stoper");
		String userName = data.get("userName");
		String password = data.get("password");

		if (userName.equals("Anil") && !password.equals("spiderman") && password.equals("batman")
				&& password.equals("antman") && password.equals("rider") && password.equals("stopper"))

		{
			model.addObject("msg", "not valid username and password");
		}

		else if (userName.equals("varun") && password.equals("spiderman") && !password.equals("batman")
				&& password.equals("antman") && password.equals("rider") && password.equals("stopper"))
 {
			model.addObject("msg", "not valid username and password");
		}

		else if (userName.equals("naveen") && password.equals("spiderman") && password.equals("batman")
				&& !password.equals("antman") && password.equals("rider") && password.equals("stopper"))
 {
			model.addObject("msg", "not valid username and password");
		}

		else if (userName.equals("siddu") && password.equals("spiderman") && password.equals("batman")
				&& password.equals("antman") && !password.equals("rider") && password.equals("stopper"))
 {
			model.addObject("msg", "not valid username and password");
		}

		else if (userName.equals("jagadesh") && password.equals("spiderman") && password.equals("batman")
				&& password.equals("antman") && password.equals("rider") && !password.equals("stopper"))
 {
			model.addObject("msg", "not valid username and password");
		} else {
			model.addObject("user", userName);
			model.addObject("pass", password);
		}
		model.setViewName("backspace");
		return model;
	}

}
