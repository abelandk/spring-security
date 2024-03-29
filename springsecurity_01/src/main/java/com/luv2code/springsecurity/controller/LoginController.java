package com.luv2code.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/loginPage")
	public String loginPage() {
		
		// return "login"; //Simple Login
		return "fancy-login";
	}
	
	@GetMapping("/accessDenied")
	public String showDeniedPage() {
		
		return "access-denied";
	}
}
