package com.example.demo.Crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrudController {
	@Autowired
	CrudService crud;
	@PostMapping("/create1")
	public void create1() {
	crud.Createtable();
		
	}

	@PostMapping("/itg")
	public String addCrudapi(@RequestBody Crudapi capi )
	{
		int i= crud.add(capi);

		if(i>0)
		{
			return "data inserted successfully";
		}
		else 
		{
			return "data not inserted";
		}
		
		
	}
	
	
}
