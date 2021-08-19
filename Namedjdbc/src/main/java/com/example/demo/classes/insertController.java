package com.example.demo.classes;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController

public class insertController {
	
	    @Autowired
	    insertService obj;
	    
	    @PostMapping("/post")
		public Map<String, String> insert1(@RequestBody insert inst) {
		  Map<String, String> i = obj.insert(inst);
		return i;
		  
	
		}
		

}
