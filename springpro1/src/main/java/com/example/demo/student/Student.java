package com.example.demo.student;

import java.util.*;
import java.util.Map.Entry;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

class Userbody
{
	private int id;
	private String name;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
}




@RestController
@RequestMapping("/student")
public class Student {
 
      Map<Integer,Userbody> m=new HashMap();
	
	  @PutMapping("/studentname")
	public ArrayList<String> list()
	{
		  ArrayList al= new ArrayList();
		  al.add("Rajesh");
		  al.add("Krishna");
		  al.add("lazar");
		  return al;
		
	}
	  @PostMapping("/studentbranch")
	    public String post1()
	    {
		  return "LAZAR IS SWEETY";
	    }
	  
	  @PostMapping("{name}/{branch}")
	  String get(@PathVariable("name")  String name, @PathVariable("branch")  String branch)
	  {
		  return ("Hello "+name+" "+"\nYour Branch is "+branch);
	  }
	  
	  @GetMapping
	  String get1(@RequestParam  String name, @RequestParam  String branch)
	  {
		  return ("Hello "+name+" "+"\nYour Branch is "+branch);
	  }
	  @GetMapping("/maps")
	  Map<Integer,String> maps()
	  {
		  Map<Integer,String>  m=new HashMap<>();
		  m.put(1, "First Year");
		  m.put(2, "Second Year");
		  m.put(3, "Thrid Year");
		  for(Integer mp : m.keySet())
			 {
				 //String name= mp.get(name);
				System.out.println(mp);
			 }
		  return m;
		}
	  
	  @PostMapping("/body")
	  public ResponseEntity<Object> json(@RequestBody Body b)
	  {
     	  Userbody ub=new Userbody(); 
		  
		    ub.setId(b.getId());
		    ub.setName(b.getName());
		    ub.setEmail(b.getEmail());
		    m.put(1,ub);
		    
		return new ResponseEntity<>(m.values(),HttpStatus.OK);
		  
	  }

}

