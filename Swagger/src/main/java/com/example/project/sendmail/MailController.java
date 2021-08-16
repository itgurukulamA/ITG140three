package com.example.project.sendmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class MailController {
	@Autowired MailService ms;
       @RequestMapping(value = "/msg", method = RequestMethod.POST)
       public String sendmsg(@RequestBody Mail m)
   	{
   		String s=ms.mailmsg(m);
   	  	return s;
   	}
   }
	
