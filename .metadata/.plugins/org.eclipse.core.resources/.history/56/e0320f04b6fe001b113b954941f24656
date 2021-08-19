package com.example.demo.Jdbcpojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service

public class PojoServices {
	@Autowired
	JdbcTemplate obj;
	public int insert(Pojo pj) {
		int id=pj.getId();
		String name=pj.getName();
		int age=pj.getAge();
		String college=pj.getCollege();
		
		String b="insert into ece(id,name,age,college)values(?,?,?,?)";
    return obj.update(b,id,name,age,college);
		
    
		
	}

}
