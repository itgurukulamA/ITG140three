package com.example.demo.asp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AspectsController {
	@Autowired
	AspectsService asp;

	 @RequestMapping(value = "/add", method = RequestMethod.GET)
	 public Aspects addAspects(@RequestBody Aspects em)
	 {
	  return asp.createAspects(em);
	 }
	}


