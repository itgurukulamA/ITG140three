package com.example.demo.Crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service

public class CrudService {
	@Autowired
	JdbcTemplate obj;
	public void Createtable() {
		String sql="create table chitti (id integer, emp_name varchar(40),emp_phnno integer,emp_mail varchar(45))";
		obj.execute(sql);
	}
	public int add(Crudapi capi) {
		String sql ="insert into itg values(?,?,?,?,?)";
		return obj.update(sql,capi.getId(),capi.getName(),capi.getAge(),capi.getPhno(),capi.getMail());
	}
}
