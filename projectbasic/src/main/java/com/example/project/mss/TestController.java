package com.example.project.mss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Autowired 
	TestService ts;
	@RequestMapping("/")
    public String name()
    {
    	
    	return "msg";
    }
	@RequestMapping("/add")
	public int sum()
	{
		int i=10,j=20;
		int c=i+j;
		return c;
		
	}
	@PostMapping("/student")
	public int addition(@RequestBody Test t)
	{
		int j=ts.add(t);
		return j;
	}
	@PostMapping("/queryParam")
	public int addition1(int a, int b)
	{
		return a+b;
	}
}


