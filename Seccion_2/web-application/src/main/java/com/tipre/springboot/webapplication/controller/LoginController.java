package com.tipre.springboot.webapplication.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tipre.springboot.webapplication.service.LoginService;




@Controller
public class LoginController {
	
	LoginService service = new LoginService();
	
	@GetMapping("/login")
	public String loginMessage(ModelMap model) {
		return "login";
	}
	
	
	@PostMapping("/login")
	public String login(@RequestParam String name,@RequestParam String password, ModelMap model) {
		
		boolean isValid = service.validateUser(name, password);
		if(isValid) {
			model.put("name", name);
			model.put("password", password);

			return "welcome";			
		}
		else {
			return "errorLogin";
		}

	}
	
}
