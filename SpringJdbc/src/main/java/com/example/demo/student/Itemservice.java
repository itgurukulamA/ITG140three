package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public class Itemservice 
{

	@Autowired
	JdbcTemplate jdbcTemplate;
	//Items i =new Items();
	
	public String addItem(Items item) {
		String sql ="insert into mes1(itemname,Description,Price) values(?,?,?)" ;
		int result = jdbcTemplate.update(sql,item.getItemname(),item.getDescription(),item.getPrice());
		// TODO Auto-generated method stub
		if (result>0)
		{
			return "Inserted succesfully" ;
		}
	}
}

