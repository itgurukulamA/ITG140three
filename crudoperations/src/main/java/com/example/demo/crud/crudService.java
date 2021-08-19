package com.example.demo.crud;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class crudService {
	
	  @Autowired
      JdbcTemplate jdbcTemplate;
      
    public String insert(crud cd) {
    	  String s = "insert into employee(id,name,desigination,salary)values(?,?,?,?)";
    	  int s1 = jdbcTemplate.update(s,cd.getId(),cd.getName(),cd.getDesigination(),cd.getSalary());
    	  if(s1>0) {
    		  return "data inserted successfully";
    	  }else {
    		  return "data not inserted";
    	  }
      }
      public String update(crud cd) {
    	  String s2 = "UPDATE employee SET name=? WHERE id=?";
    	  int s3 = jdbcTemplate.update(s2,cd.getName(),cd.getId());
    	  if(s3>0) {
    		  return "updated successfully";
    	  }else {
    		  return "not updated";
    	  }
      }
      public String delete(crud cd) {
    	  String sql = "DELETE FROM employee WHERE id=?";
    	  int sql1 = jdbcTemplate.update(sql,cd.getId());
    	  if(sql1>0) {
    		  return "deleted successfully";
    	  }else {
    		  return "not deleted";
    	  }
      }
      public List getAll() {
    	  Map map = null;
  		  List obj = new ArrayList();
  	      List<Map<String, Object>> obj1 = new ArrayList<Map<String, Object>>();
  		  String sql = "select * from employee";

  		try {
  			obj1 = jdbcTemplate.queryForList(sql);

  			for (Map<String, Object> row : obj1) {
  				map = new HashMap();
  				map.put("id", row.get("id"));
  				map.put("name", row.get("name"));
  				map.put("desigination", row.get("desigination"));
  				map.put("salary", row.get("salary"));
  				obj.add(map);
  			}

  		} catch (Exception e) {
  			map.put("error", "Error occured");

  		}
  		
  		return obj;
      }
      public List get(int id) {
    	  Map map1 = null;
    	  List li = new ArrayList();
    	  List<Map<String, Object>> li1 = new ArrayList<Map<String, Object>>();
    	  String sql1 = "select * from employee where id = ?";
    	  
    	  li1 = jdbcTemplate.queryForList(sql1,id);
    	  
    	  for(Map<String, Object> ob : li1) {
    		  map1 = new HashMap();
    		  map1.put("id", ob.get("id"));
    		  map1.put("name", ob.get("name"));
    		  map1.put("desigination", ob.get("desigination"));
    		  map1.put("salary", ob.get("salary"));
    		  li.add(map1);
    	  }
		return li;
    	
      }
       
}
