package com.example.project.adminstrator;

public class Project {
    
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String phoneno;
	private String role;
	private String reporting;
	private String Authorization;
	public Project()
	{}
	
	public Project(int id,String fname, String lname, String email, String phoneno, String role) {
		
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phoneno = phoneno;
		this.role = role;
	}
	

	public Project(String Authorization,int id, String fname, String lname, String email, String phoneno, String role, String reporting) {
	
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phoneno = phoneno;
		this.role = role;
		this.reporting = reporting;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneno() {
		return phoneno;
	}


	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getReporting() {
		return reporting;
	}


	public void setReporting(String reporting) {
		this.reporting = reporting;
	}


	public String getAuthorization() {
		return Authorization;
	}


	public void setAuthorization(String authorization) {
		Authorization = authorization;
	}



	
}
