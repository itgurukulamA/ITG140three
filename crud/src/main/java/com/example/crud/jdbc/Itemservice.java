package com.example.crud.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;


@Service
public class Itemservice {

	@Autowired
	JdbcTemplate jdbcTemplate;
	//Items i =new Items();
	
	public String additem(Item item) {
		String sql ="insert into mes1(itemname,itemdescription,itemprice) values(?,?,?)" ;
		int result = jdbcTemplate.update(sql,item.getItemname(),item.getItemdescription(),item.getItemprice());
		// TODO Auto-generated method stub
		if (result<0)
		
			return "Failed" ;
		
		else
		return "success"; 
	}

	public String deleteItem(Item item) {
		// TODO Auto-generated method stub
		String query1="delete from mes1 where itemid=?";  
	    int res = jdbcTemplate.update(query1,item.getItemid());
	    
	    if(res>0)
	    {
	    	return "Success";  
	    }
	    else
	    {
	    	return "Failed";
	    }

	}  
	public String update(Item item)
	{
		String query1="update mes1 set itemname=? where itemid=?";
		int res1=jdbcTemplate.update(query1,item.getItemname(),item.getItemid());
		if(res1>0)
			return "Success";
		else
			return "Failed";
	}
	public List<Item> select(Item item)
	{
		String sql="select * from mes1 ";

		  return jdbcTemplate.query(
		              sql,
		              (rs,rowNum)->new Item(
		              rs.getInt(1),
		              rs.getString(2),
		              rs.getString(3),
		              rs.getInt(4)
		       )
		              );
		
		
	}
}
