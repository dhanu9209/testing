package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
public String welcome() {
	System.out.println("from eclipse");
	System.out.println("second commit from eclipse");
	return "Hello World";
}
}
