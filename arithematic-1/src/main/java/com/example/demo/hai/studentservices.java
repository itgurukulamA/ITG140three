package com.example.demo.hai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
@Service
public class studentservices {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
    public int insert(student stud) {
    	int id = stud.getId();
    	String name = stud.getName();
    	int age = stud.getAge();
    	int phno = stud.getPhno();
    	String email = stud.getEmail();
    	String s="insert into student values(?,?,?,?,?)";
    	return jdbcTemplate.update(s,id,name,age,phno,email);
       
    	}
    public String update(student stud) {
    	String s1 = "UPDATE student SET email = ? WHERE id = ?";
    	int s2 = jdbcTemplate.update(s1,stud.getEmail(),stud.getId());
    	if(s2>0) {
    		return "data is updated successfully";
    	}
    	else {
    		return "data is not updated";
    	}
    }
}
