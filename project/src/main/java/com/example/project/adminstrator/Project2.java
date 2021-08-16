package com.example.project.adminstrator;

public class Project2 {

	private int id;
	private String Name;
	private String cname;
	private String createdby;
	private String startdate;
	private String enddate;
	private String status;
	
	public Project2(int id, String name, String cname, String createdby, String startdate, String enddate, String status) {
		
		this.id = id;
		this.Name = name;
		this.cname = cname;
		this.createdby = createdby;
		this.startdate= startdate;
		this.enddate = enddate;
	     this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
