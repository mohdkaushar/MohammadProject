package com.mohammed;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/Hello")
public class HelloController {
	@RequestMapping(value = "/index, method = RequestMethod.GET")
	public String index(ModelMap modelMap){
		modelMap.addAttribute("message", "Hello Spring MVC With Maven!!!!!!");
		return "Hello";
	}

}
