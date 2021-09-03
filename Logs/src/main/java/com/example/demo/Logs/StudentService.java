package com.example.demo.Logs;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
	@Autowired JdbcTemplate jt;
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

}
