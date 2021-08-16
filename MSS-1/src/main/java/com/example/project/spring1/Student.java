package com.example.project.spring1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
     private int id;
     private int age;
     private int phoneNo;
     private String name;
     private String email;
	public Student(int id, int age, int phoneNo, String name, String email) {
		super();
		this.id = id;
		this.age = age;
		this.phoneNo = phoneNo;
		this.name = name;
		this.email = email;
	}

	
	
}
