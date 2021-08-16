package com.example.project.adminstrator;

public class Project3 {
      private int pid;
      private int tid;
      private String tname;
      private String createdby;
      private String startdate;
      private String enddate;
      private String resourcename;
	
	public Project3(int pid, int tid, String tname, String createdby, String startdate, String enddate,String resourcename) {
		
		this.pid = pid;
		this.tid = tid;
		this.tname = tname;
		this.createdby = createdby;
		this.startdate = startdate;
		this.enddate = enddate;
		this.resourcename = resourcename;
	}
	
	public Project3(int pid, int tid, String tname, String createdby, String resourcename) {
		
		this.pid = pid;
		this.tid = tid;
		this.tname = tname;
		this.createdby = createdby;
		this.resourcename = resourcename;
	}
	public Project3() {}

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
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
	public String getResourcename() {
		return resourcename;
	}
	public void setResourcename(String resourcename) {
		this.resourcename = resourcename;
	}
	
}
