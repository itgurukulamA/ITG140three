package com.example.project.spring1;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	static Logger log = Logger.GetLoggerFactory(Student.class);
	@Autowired 
	JdbcTemplate jt;
	@Autowired 
	NamedParameterJdbcTemplate np;
   public int insert(Student s)
   {
	   int id=s.getId();
	   int age= s.getAge();
	   String name= s.getName();
	   String email= s.getEmail();
	   int no= s.getPhoneNo();
	   
	  // System.out.println(no);
	   //System.out.println(id);
	   //System.out.println(age); 
	   String sql= "insert into mssitg140 values(?,?,?,?,?)";
	   return jt.update(sql,id,name,age,email,no);
	 }
   public int update1(Student s)
   {
	   String sql1="update mssitg140 set name=? where id=?"; 
	   return jt.update(sql1,s.getName(),s.getId());
   }
   
   public Map<String,String> insertn(Student s)
   {
	   Map<String,String> m=new HashMap();
	           String sql2= "insert into mssitg140 (id,name,age,email,phoneNo) values(:id,:name,:age,:email,:phoneNo)";
	           SqlParameterSource sps = new MapSqlParameterSource()
	           .addValue("id",s.getId())
	           .addValue("name",s.getName())
	           .addValue("age",s.getAge())
	           .addValue("email",s.getEmail())
	           .addValue("phoneNo",s.getPhoneNo());
			    int i=np.update(sql2,sps);
			    if(i>0)
			    {
			    	m.put("200", "Inserted Successfully");
			    }
			    else
			    {
			    	m.put("Failed", "Insertion Failed");
			    }
				return m;
   }
}
