package com.example.demolog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Log4jController {
	@Autowired
	Log4jService logs;
	@PostMapping("/itg")
	public String addLog4j(@RequestBody Log4j lg )
	{
		int i= logs.add(lg);

		if(i>0)
		{
			return "data inserted successfully";
		}
		else 
		{
			return "data not inserted";
		}
		
		
	}
	
	
}

	