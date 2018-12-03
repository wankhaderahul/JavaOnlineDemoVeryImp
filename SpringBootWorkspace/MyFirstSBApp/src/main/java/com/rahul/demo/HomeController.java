package com.rahul.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	/*@RequestMapping("/home")
	@ResponseBody
	public ModelAndView homes(){
		ModelAndView mv=new ModelAndView("home.jsp");
		System.out.println("Hi");
		return mv;
	}*/

	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "home";
	}


}
