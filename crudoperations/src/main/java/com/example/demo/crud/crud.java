package com.example.demo.crud;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class crud {
	private int id;
	private String name;
	private String desigination;
	private int salary;
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
	public String getDesigination() {
		return desigination;
	}
	public void setDesigination(String desigination) {
		this.desigination = desigination;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public List get(int i, String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
