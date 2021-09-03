package com.example.demo.AspectDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AspectController {
	@Autowired AspectService as;
 @RequestMapping(value = "/aspect", method = RequestMethod.GET)
public AspectDemo aspect(@RequestBody AspectDemo ad)
{
	return as.aspectdemo(ad);
}
}