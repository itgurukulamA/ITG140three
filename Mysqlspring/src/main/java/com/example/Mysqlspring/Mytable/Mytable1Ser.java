package com.example.Mysqlspring.Mytable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.Mysqlspring.Mytable1;

@Service
public class Mytable1Ser {
@Autowired
JdbcTemplate Jdbc;
@Autowired
NamedParameterJdbcTemplate npjdbc;

public int add(Mytable1 it) {
	String nAME=it.getNAME();
	int iD=it.getID();
	int aGE=it.getAGE();
	String sqlquery="insert into Mytable1(NAME,ID,AGE) values (?,?,?)";
	return Jdbc.update(sqlquery,nAME,iD,aGE);
}
}
