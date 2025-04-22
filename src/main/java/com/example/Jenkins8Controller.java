package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Jenkins8Controller {
	
@GetMapping("/Sample2")
public String method1() {
	return "Hello World using Java 8!!";
}
}
