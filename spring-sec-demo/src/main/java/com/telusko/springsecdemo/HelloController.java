package com.telusko.springsecdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/")
	public String greet() {
		return "Hello World from 1st project";
	}
	@GetMapping("hello")
	public String greet1() {
		return "Hello World from 2nd project";
	}
	
}
