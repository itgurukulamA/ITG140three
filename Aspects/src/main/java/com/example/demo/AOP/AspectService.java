package com.example.demo.AOP;

import org.springframework.stereotype.Service;
@Service
public class AspectService {
	public Aspect createAspect(Aspect a)
	{
	System.out.println("service");
	return a;
	}
	}


