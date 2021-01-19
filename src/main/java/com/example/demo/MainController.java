package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
public String welcome() {
	System.out.println("hello");
	return "Hello World";
}
}
