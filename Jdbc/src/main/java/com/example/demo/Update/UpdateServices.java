package com.example.demo.Update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.metadata.CallMetaDataProvider;

public class UpdateServices {
@Autowired

JdbcTemplate jdbcTemplate;
public String insert (Update cd) {
	int id=cd.getId();
	String name=cd.getName();
	int age= cd.getAge();
	String college=cd.getCollege();
	
	String sql="insert into ece values(?,?,?,?)";
	 int i=jdbcTemplate.update(sql,id,name,age,college);
		
	
	if (i>0) {
		return "data inserted successfully";
	}else {
		return "data not inserted";
	
	}
}

public String update(Update cd) {
	int id=cd.getId();
	String name=cd.getName();
	int age=cd.getAge();
	String college=cd.getCollege();
	String s1="Update ece SET name=? WHERE id=?";
	int b=jdbcTemplate.update(s1,cd.getName(),cd.getId());
	if (b>0) {
		return "data inserted successfully";
	}else {
		return "data not inserted";
	
		
	}
}	
}