package com.example.project.adminstrator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Projectcontroller {

  @Autowired
   Projectservice proservice;
	@PostMapping("/project")
	public String project1(@RequestBody Project project)
	{
		return proservice.insertproject(project);
	}
	@PostMapping("/project1")
     public String project2(@RequestBody Project2 project1)
     {
		return proservice.insertprojectservice(project1);
     }
	
	@PostMapping("/project2")
	
		public String project3(@RequestBody Project3 project2)
		{
			return proservice.insertprojectcontants(project2);
		}
	
	@PostMapping("/project3")
	
    public List<Project4> search(@RequestBody Project4 project)
    {
		return proservice.join(project);
    }
	
	@PostMapping("/project4")
	public String update(@RequestBody Project2 project)
	{
		return proservice.update(project);
	}
	
	@PostMapping("/project5")
	public List<Project2> search1(@RequestBody Project2 pro)
	{
		return proservice.projectssearch(pro);
	}
	
	@PostMapping("/project6")
	public List<Project3> search2(@RequestBody Project3 pro)
	{
		return proservice.projectcontactssearch(pro);
	}
	@GetMapping("/project1")
	public int count(@RequestBody Project pro)
	{
		return proservice.countpro(pro);
		
	}
	
	@GetMapping("/project")
	public int count1(@RequestBody Project2 pro)
	{
		return proservice.count(pro);
	}
	
	@GetMapping("/project2")
	public int count1(@RequestBody Project3 pro)
	{
		return proservice.countprocon(pro);
	}
	
	@PostMapping("/project7")
	public List<Project3> emp(@RequestBody Project3 pro1)
	{
		return proservice.employee(pro1);
	}
	
@PostMapping("/project8")
	
    public List<Project4> search1(@RequestBody Project4 project)
    {
		return proservice.join1(project);
    }
   @PostMapping("/project9")
   public String resource1(@RequestBody Project5 project)
   {
	   return proservice.resource(project);
   }
	
	
}
