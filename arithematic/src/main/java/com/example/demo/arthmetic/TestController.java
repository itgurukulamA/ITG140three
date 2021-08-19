package com.example.demo.arthmetic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/addition")
	public int add(int a,int b) {
		return a+b;
	
}
	
}
