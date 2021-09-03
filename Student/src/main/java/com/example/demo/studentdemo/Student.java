package com.example.demo.studentdemo;

public class Student {
private int id;
private String name;
private String email;
public Student(int id, String name, String email) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

private int pageno;
private int pagesize;
public int getPageno() {
	return pageno;
}
public void setPageno(int pageno) {
	this.pageno = pageno;
}
public int getPagesize() {
	return pagesize;
}
public void setPagesize(int pagesize) {
	this.pagesize = pagesize;
}

}