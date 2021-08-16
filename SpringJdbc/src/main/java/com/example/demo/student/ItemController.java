package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ItemController {

	@Autowired
	ItemService i;
	@PostMapping("/item")
	public String additem(@RequestBody Items item )
	{
		String a=i.addItem(item);
		return a;
	}
	
}
