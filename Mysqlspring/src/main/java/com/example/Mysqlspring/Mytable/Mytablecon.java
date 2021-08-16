package com.example.Mysqlspring.Mytable;

import java.awt.PageAttributes.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Mysqlspring.Mytable1;

@RestController
public class Mytablecon {
@Autowired
  Mytable1Ser is;
@RequestBody(value = "/Mytble1",method = RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE}) 
//@PostMapping (values = = "/add ")
public String add(@RequestBody Mytable1 it) {
	if(is.add(it)>0) {
		return "Insert";
		else 
			return "Fail";
	}
}
}
