package com.example;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Jenkins8Controller {
	
@GetMapping("/Sample2")
public String method1(HttpServletRequest req) {
	return "Hello World using Java 8!!";
}
}
