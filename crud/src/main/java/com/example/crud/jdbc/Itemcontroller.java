package com.example.crud.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Itemcontroller {

	@Autowired
	Itemservice service1;
	@PostMapping("/item")
	
	public String additems(@RequestBody Item item )
	{
		return service1.additem(item);
		
	}
	
	@DeleteMapping("/item")
	public String deleteitems(@RequestBody Item item)
	{
		return service1.deleteItem(item);
				
	}
	@PutMapping("/item")
	public String updateitems(@RequestBody Item item)
	{
		return service1.update(item);
	}
	@GetMapping("/item")
	public List<Item> select1(@RequestBody Item item)
	{
		return service1.select(item);
	}
}
