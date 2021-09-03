package com.example.demo.studentdemo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired JdbcTemplate jt;
	@Autowired NamedParameterJdbcTemplate njt;

	public static Logger log=Logger.getLogger(StudentService.class);
	public int insert(Student s)
	 {
	   String sql = "insert into student values(?,?,?)";
	   int id = s.getId();
	   String name =s.getName();
	   String email = s.getEmail();
	   log.info("inserted");
	   return jt.update(sql,id,name,email);
	}
	public Map<String, String> insertparam(Student s)
	{
	 Map<String, String> m = new HashMap<String, String>();
	 int result = 0;
	 try  
	 {
	  String sql = "insert into student(id,name,email) values(:id,:name,:email)";
	   SqlParameterSource sps = new MapSqlParameterSource()
	    .addValue("id",s.getId())
	    .addValue("name",s.getName())
	    .addValue("email",s.getEmail());
	     result = njt.update(sql,sps);
	     if (result > 0)
	     {
	      m.put("Success", "Data inserted");
	     }
	     else
	     {
	      m.put("failed", "Data insertion failed");
	     }
	  }
	  catch (Exception e)
	  {
	     m.put("Error", "Error occured");
	  }
	 return m;
	}
	public void Createtable()
	  {
		  String sql="create table bhuvana(id integer,name varchar(40),phnno integer)";
		  jt.execute(sql);
	  }
	  public List selection()
	  {
	 Map<String,Object> map=null;
	 List list=new ArrayList();
	 List<Map<String,Object>> obj=new ArrayList<Map<String,Object>>();
	 String sql= "select * from student";
	 obj=jt.queryForList(sql);
	 for(Map<String,Object> r1:obj)
	 {
	 map=new HashMap<String,Object>();
	 map.put("id",r1.get("id"));
	 map.put("name",r1.get("name"));
	 map.put("email",r1.get("email"));
	 list.add(map);
	 }
	 return list;
	   }
	  public List selectone(int id)
	  {

	 Map<String,Object> map=null;
	 List list=new ArrayList();
	 List<Map<String,Object>> obj=new ArrayList<Map<String,Object>>();
	 String sql= "select id,name,email from student where id=?";
	 obj=jt.queryForList(sql,id);
	 for(Map<String,Object> r1:obj)
	 {
	 map=new HashMap<String,Object>();
	 map.put("id",r1.get("id"));
	 map.put("name",r1.get("name"));
	 map.put("email",r1.get("email"));
	 list.add(map);
	 }
	 return list;
	  }
	  public int delete(Student s)
	  {
		  String sql="delete from student where id=?";
		  int id=s.getId();
		  return jt.update(sql,id);
	  }
	  public int update(Student s)
		 {
		   String sql ="update student set name=? where id=?";
		    String name =s.getName(); 
		   int id = s.getId();
           return jt.update(sql,name,id); 
	}
	  public List pagination(int pageno,int pagesize)
	  {
	     String sql ="select * from student limit ";
	     int i =(pageno-1) * pagesize;
	     sql=sql+i+","+ pagesize;
	     Map<String,Object> map=null;
	     List list=new ArrayList();
	     List<Map<String,Object>> obj=new ArrayList<Map<String,Object>>();
	     obj=jt.queryForList(sql);
	     for(Map<String,Object> r1:obj)
	     {
	     map=new HashMap<String,Object>();
	     map.put("id",r1.get("id"));
	     map.put("name",r1.get("name"));
	     map.put("email",r1.get("email"));
	     
	     list.add(map);
	     }
	     return list;
	  }
 
}
