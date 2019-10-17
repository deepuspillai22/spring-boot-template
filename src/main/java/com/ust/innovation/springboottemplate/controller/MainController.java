package com.ust.innovation.springboottemplate.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping("/test")
	public String testConnection() {
		return "Connection OK";
	}

}
