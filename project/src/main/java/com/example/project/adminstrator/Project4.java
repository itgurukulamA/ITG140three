package com.example.project.adminstrator;

public class Project4 {
	private int pid;
	private String Name;
	private String cname;
	private String createdby;
	private String startdate;
	private String enddate;
	private String status;
	
     private int tid;
     private String tname;
    
     private String resourcename;
     

	public Project4(int pid, String name, String cname, String createdby, String startdate, String enddate,
			String status, int tid, String tname, String resourcename) {
		super();
		this.pid = pid;
		Name = name;
		this.cname = cname;
		this.createdby = createdby;
		this.startdate = startdate;
		this.enddate = enddate;
		this.status = status;
		this.tid = tid;
		this.tname = tname;
		this.resourcename = resourcename;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
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

	public String getResourcename() {
		return resourcename;
	}

	public void setResourcename(String resourcename) {
		this.resourcename = resourcename;
	}

	
}
