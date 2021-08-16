package com.example.demo.Jdbcpojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PojoController {
	@Autowired
	PojoServices ps;
	
	@PostMapping("/table")
	public String insert1 (@RequestBody Pojo pj) {
		int i=ps.insert(pj);
		if(i>0) {
			return ("data inserted successfully");
		}
		else {
			return ("data not inserted");
		}
	}
	
}	
		
			
			
		
		
		
	

