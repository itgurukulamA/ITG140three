package com.example.demo.Jdbcpojo.njdbc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class NamedjdbcServices {
	
@Autowired	
	NamedParameterjdbcTemplate tem;
public Map<String, String> data=new HashMap<String,String>();
int result=0;
	
   public String insert(Namedjdbc jdbc) {
	   int id=jdbc.getId();
	   String name=jdbc.getName();
	   int age=jdbc.getAge();
	   String college=jdbc.getCollege();

		String b="insert into ece(:id,:name,:age,:college)";  
		 return tem.update(b,id,name,age,college);
		 
			
}
}  
	


