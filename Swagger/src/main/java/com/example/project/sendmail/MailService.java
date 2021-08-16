package com.example.project.sendmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
	@Autowired 
	private JavaMailSender jms;
       public String mailmsg(Mail m) 
       {
    	  
    	   SimpleMailMessage smm=new SimpleMailMessage();
    	   smm.setTo(m.getEmail());
    	   smm.setSubject(m.getSubject());
    	   smm.setText(m.getMsg());
    	   smm.setCc(m.getCc());
    	   
    	   try {
    		  jms.send(smm);
    	  }
    	  catch(Exception e)
    	  {
    		  System.out.println(e);
    		  return "Fail";
    	  }
		return "Success";
    	   
       }
}
