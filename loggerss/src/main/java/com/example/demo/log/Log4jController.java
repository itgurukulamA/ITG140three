package com.example.demo.log;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Log4jController {
	 @Autowired
	 Log4jService ls;
	 @PostMapping("/insertion")
	 public String insert(@RequestBody Log4jtest lg)
	 {
	  int i = ls.insert(lg);
	  if (i > 0)
	  {
	    return "Data inserted successfully";
	  }
	  else
	  {
	    return "Data insertion failed";
	  }
	 }

	  @PostMapping("/namedinsertion")
	  public Map<String, String> insertparameters(@RequestBody Log4jtest lg)
	  {
	   Map<String, String> i = ls.insertparameters(lg);
	   return (i);
	  }

}
