package com.example.demo.Jdbcpojo.njdbc;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Jdbcpojo.Pojo;

@RestController

public class NamedjdbcControllers {
            NamedjdbcServices njs;
            
            
        	public String insert1 (@RequestBody Namedjdbc jk) {
        		int n=njs.insert(jk);
        		if(n>0) {
        			return ("data inserted successfully");
        		}
        		else {
        			return ("data not inserted");

}
