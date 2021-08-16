package com.example.StudentSpring.one;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

@Service
public class StudentServ {
	

	@Autowired
	JdbcTemplate Jdbc;
	@Autowired
	NamedParameterJdbcTemplate npjdbc;

	public int add(Student1 it) {
		int iD=it.getId();
		String name=it.getName();
		String gender=it.getGender();
		int age=it.getAge();
		String sqlquery="insert into demodb.student (id, name,gender,age) values (?,?,?,?)";
		return Jdbc.update(sqlquery,iD,name,gender,age);
	}

	public Map <String,String> insertstudent(Student1 s){
		Map <String,String> ai=new HashMap<String,String>();
		int result=0;
		String sql="insert into demodb.student (id, name,gender,age) values (:id,:name,:gender,:age)";
		try {
			SqlParameterSource Parameter=new MapSqlParameterSource()
					.addValue("id",s.getId())
					.addValue("name",s.getName())
					.addValue("gender",s.getGender())
					.addValue("age",s.getAge());
					result=npjdbc.update(sql,Parameter);
					if(result>0) 
						ai.put("success", "record inserted");
						
						else
							ai.put("fail", "unable to insert record");
					}catch(Exception e){
						ai.put("error", "error occured");
					}
					return ai;
	}


 public java.util.List getStudents() {
	List studentsList = new ArrayList();
	Map datamap= null;
	String query = "Select * from student";
	java.util.List<Map<String,Object>> studentdata=new ArrayList<Map<String ,Object>>();
	studentdata = Jdbc.queryForList(query);
	for(Map<String,Object> data:studentdata) {
		datamap =  new HashMap();
		datamap.put("id",data.get("Id"));
		datamap.put("name",data.get("Name"));
		datamap.put("gender",data.get("Gender"));
		datamap.put("age",data.get("Age"));
		System.out.println(datamap);
		studentsList.add(datamap);
				
	}
	
	return studentsList;
	}
		
}






