package com.example.demo.Crud;

public class Crudapi {
	private int id;
	private String name;
	private int age;
	private int phno;
	private String mail;

	public Crudapi() {
		super();
	}

	public Crudapi(int id, String name, int age, int phno, String mail) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.phno = phno;
		this.mail = mail;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPhno() {
		return phno;
	}

	public void setPhno(int phno) {
		this.phno = phno;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

}