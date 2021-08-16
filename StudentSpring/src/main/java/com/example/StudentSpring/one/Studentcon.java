package com.example.StudentSpring.one;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Studentcon {
	@Autowired
	  StudentServ is;
	
		/*
		 * @RequestMapping(value = "/addStudent1",method = RequestMethod.POST,produces =
		 * {MediaType.APPLICATION_JSON_VALUE})
		 * 
		 * @ResponseBody //@PostMapping (values = = "/add ") public String
		 * add(@RequestBody Student1 it) { if(is.add(it)>0) return "Insert"; else return
		 * "Fail"; }
		 */
	@PostMapping("/studentdata")
	public Map insertstudents(@RequestBody Student1 student) {
	Map addStudent1 = is.insertstudent(student);
		
		return addStudent1;
	}
	@GetMapping("/studentdata-s")
	public List getStudents() {	
	List data = is.getStudents();
	if(data == null)
		return null;
	else
		return data;
	}
}








