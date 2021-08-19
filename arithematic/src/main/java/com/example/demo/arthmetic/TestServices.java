package com.example.demo.arthmetic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestServices {
	
	public int add(Test ts) {
		return ts.getParameter1()+ts.getParameter2();
	}

}
