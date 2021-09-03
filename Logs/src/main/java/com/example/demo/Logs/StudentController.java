package com.example.demo.Logs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
@Autowired StudentService ss;
@PostMapping("/insert")
public String insert (@RequestBody Student s  ) {
	 int i = ss.insert(s);
	 if (i > 0)
	 {
	   return "Data inserted";
	 }
	 else
	 {
	   return "Data insertion failed";
	 }
	}
}
