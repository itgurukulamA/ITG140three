package com.example.demo.Update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class UpdateController {
@Autowired

    UpdateServices us;
	
	@PostMapping("/table")
	public String insert1 (@RequestBody Update up) {
		return us.insert(up);
	}
	@PostMapping("/table1")
	public String update(@RequestBody Update up)
	{
		return us.update(up);
		
	}
	
}	

