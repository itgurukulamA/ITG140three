package com.example.project.mss;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class TestService {
	 public int add( Test t)
	 {
		 int s= t.getPara1()+t.getPara2();
		 return s;
	 }
	 
	
}
