package com.example.demo.log;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

@Service

public class Log4jService {
	 @Autowired
	 JdbcTemplate jt;
	 @Autowired
	 NamedParameterJdbcTemplate namedjdbc;
	 
//	 public  static Logger log=Logger.
	 public int insert(Log4jtest lg)
	 {
	   String sql = "insert into employee values(?,?,?,?,?,?,?)";
	   int id = lg.getId();
	   String name = lg.getName();
	   int age = lg.getAge();
	   int phnno = lg.getPhnno();
	   String email = lg.getEmail();
	   String design = lg.getDesign();
	   int salary=lg.getSalary();
	   return jt.update(sql, id, name, age, phnno, email, design, salary);
	}

	public Map<String, String> insertparameters(Log4jtest lg)
	{
	 Map<String, String> m = new HashMap<String, String>();
	 int result = 0;
	 try  
	 {
	  String sql = "insert into mss(id,name,age,phnno,email,design,salary) values(:id,:name,:age,:phnno,:email,:design,:salary)";
	   SqlParameterSource parameters = new MapSqlParameterSource().addValue("id", lg.getId())
	    .addValue("name", lg.getName())
	    .addValue("age",lg.getAge())
	    .addValue("phnno",lg.getPhnno())
	    .addValue("email",lg.getEmail())
	    .addValue("design", lg.getDesign())
	    .addValue("salary",lg.getSalary());
	     result = namedjdbc.update(sql, parameters);
	     if (result > 0)
	     {
	      log.info("success");
	      m.put("Success", "Data inserted successfully");
	     }
	     else
	     {
	      log.info("Fail");
	      m.put("failed", "Data insertion failed");
	     }
	  }
	   catch (Exception e)
	  {
	     m.put("Error", "Error occured try again");
	  }
	 return m;
	}


}
