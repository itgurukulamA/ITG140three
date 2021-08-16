package com.example.Sprappl.one;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Serv1 {
   	@RequestMapping("/api1/add")
		public String add(int a, int b)
		{
			int c=a+b;
			return ("A="+a+" B= " + b + " Sum = :"+c);
		}
		}

    