package com.example.demo.AspectDemo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AspectService {
public AspectDemo aspectdemo(AspectDemo ad)
{
	System.out.println("service class message");
	return ad;
}
}