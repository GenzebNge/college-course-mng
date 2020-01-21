package com.collegecoursemng.com.collegecoursemng.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/test")
	public String testText() {
		return "This is for test";
	}

}
