package com.example.Sprappl.one;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArithmeticController {

	@Autowired
	public ArithmeticService as;
	private static final Logger log=LoggerFactory.getLogger(ArithmeticController.class);
	

	@PostMapping(value = "/division")
	public String division(@RequestBody Arithmetic a) {
		log.info("enter controller");
		return as.division(a);
	}
	
	@PostMapping(value="/addition")
	
		public String addition(@RequestBody Arithmetic a) {
			return as.addition(a);
	}
}