package com.mohammad;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;


 @Controller
public class HomeController {
	 
	@RequestMapping("/hello")
	public ModelAndView hello(HttpServletRequest request,HttpServletResponse response){
		String name= request.getParameter("name");
		String password= request.getParameter("pass");
		if(password.equals("admin")){
			String message ="welcome"+name;
			return new ModelAndView("hellopage","message",message);
		}
		else {
			return new ModelAndView("errorpage","message","Invalid Password");
		}
	}
 
 }
