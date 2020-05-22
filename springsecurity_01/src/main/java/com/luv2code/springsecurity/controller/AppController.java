package com.luv2code.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class AppController {

	@GetMapping("/")
	public String showHome() {
		
		return "home";
	}
}
