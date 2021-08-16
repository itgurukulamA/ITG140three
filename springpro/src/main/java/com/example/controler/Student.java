package com.example.controler;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {

	  
		@GetMapping
		public String getStudent()
		{
			return "Hello";
			
		}
}
