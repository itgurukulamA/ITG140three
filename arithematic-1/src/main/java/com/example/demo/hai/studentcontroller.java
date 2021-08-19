package com.example.demo.hai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class studentcontroller {
	  
	    @Autowired
	    studentservices obj;
	    
	    @PostMapping("/post")
		public String insert1(@RequestBody student stud) {
		  int i = obj.insert(stud);
		  if(i>0) {
			  return "successful";
		  }else {
			  return "unsuccessful";
		  }
	
		}
	    @PostMapping("/update")
	    public String update(@RequestBody student stud) {
	    	return obj.update(stud);
	    }
		
}
