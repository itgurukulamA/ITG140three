package com.example.demo.studentdemo;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class StudentController {
@Autowired StudentService ss;
@GetMapping("/resttemp")
public String resttemp()
{
	RestTemplate rest= new RestTemplate();
    return rest.getForObject("https://reqres.in/api/users?per_page=20",String.class);	
}
@PostMapping("/create")
public void create()
{
	ss.Createtable();
}
@PostMapping("/insert")
public String insert(@RequestBody Student s)
{
 int i = ss.insert(s);
 if (i > 0)
 {
   return "Data inserted";
 }
 else
 {
   return "Data insertion failed";
 }
}
@PostMapping("/insertion")
public Map<String, String> insertparam(@RequestBody Student s)
{
 Map<String, String> i = ss.insertparam(s);
 return (i);
}
@GetMapping("/selection")
public List selection()
{
return ss.selection();
}
@GetMapping("/selectone")
public List selectone(@RequestBody Student s)
{
return ss.selectone(s.getId());
}
@PostMapping("/update")
public String update(@RequestBody Student s)
{
 int i = ss.update(s);
 if(i>0)
 {
	 return "updated";
 }
 else
 {
	 return "not updated";
 }
}
@PostMapping ("/delete")
public String delete(@RequestBody Student s)
{
	int i=ss.delete(s);
	if(i>0)
	{
		return "deleted";
	}
	else
	{
		return "not deleted";
}
}
@GetMapping("/pagination/{pageno}/{pagesize}")
public List page(@PathVariable int pageno,@PathVariable int pagesize)
{
return ss.pagination(pageno,pagesize);
}
}