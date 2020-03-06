package com.bt.video.interview.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
	
	@GetMapping({"/"})
	public String loginPage() {
		return "login";
	}
}
