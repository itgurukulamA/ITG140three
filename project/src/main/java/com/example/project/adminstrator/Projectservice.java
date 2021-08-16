package com.example.project.adminstrator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
@Service
public class Projectservice {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public String insertproject(Project pro)
	{
		String rol="admin";
		String rol1="manager";
		String rol2="employee";
		String report=pro.getReporting();
		String authorization=pro.getAuthorization();
	   String sql1="select role from contacts where fname =?";
	   try {
	   @SuppressWarnings("deprecation")
	String obj=jdbcTemplate.queryForObject(sql1, new Object[] {authorization},String.class);

	   if( obj.equals(rol))
	   {
		   if(pro.getRole().equals(rol1))
		   {
			   String sql2="select role from contacts where fname=?";   
			   @SuppressWarnings("deprecation")
			String obj1=jdbcTemplate.queryForObject(sql2, new Object[] {report},String.class);
			   if(obj1.equals(rol))
			   {
				   String sql3= "insert into contacts (fname,lname,email,phoneno,role,reporting) values(?,?,?,?,?,?)";
				   int result = jdbcTemplate.update(sql3,pro.getFname(),pro.getLname(),pro.getEmail(),pro.getPhoneno(),pro.getRole(),pro.getReporting());
					 if(result>0)
						 return "Inserted Successfully";
					 else
						 return "Insertion Failed";
				    
			   }
			   else
				   return "sorry you have to report "+rol;
			 }
		   else if(pro.getRole().equals(rol2))
		   {
			   String sql4="select role from contacts where fname=?";
			   String obj2=jdbcTemplate.queryForObject(sql4, new Object[] {report},String.class);
			   if(obj2.equals(rol1))
			   {
				   String sql5= "insert into contacts (fname,lname,email,phoneno,role,reporting) values(?,?,?,?,?,?)";
				   int result = jdbcTemplate.update(sql5,pro.getFname(),pro.getLname(),pro.getEmail(),pro.getPhoneno(),pro.getRole(),pro.getReporting());
					 if(result>0)
						 return "Inserted Successfully";
					 else
						 return "Insertion Failed";
			   }
			   else
				   return "sorry you have to report "+rol1;
		   }
		   else 
		   {
			   return "either report manager or employee";
		   }
		   
		   
	   }
	else 
	 return "Permission failed";
	   }catch(Exception e)
	   {
		   return ""+e;
	   }

}
	public String insertprojectservice(Project2 pro1)
	{
		 String fname=pro1.getCreatedby();
		 String roles="manager";
		String sql="select count(*) from contacts where role=? and fname=?";
		@SuppressWarnings("deprecation")
		int obj= jdbcTemplate.queryForObject(sql,
				    new Object[] 
				    {roles,fname},Integer.class);
		
		if(obj >0) {
			String sql1="insert into projects (Name,cname,createdby,startdate,enddate,status) values(?,?,?,?,?,?)";
			int obj2 =jdbcTemplate.update(sql1,pro1.getName(),pro1.getCname(),pro1.getCreatedby(),pro1.getStartdate(),pro1.getEnddate(),pro1.getStatus());
            if(obj2>0)
            	return "Inserted Manager Record";
            
            else
            	return "Authorization Failed : Only Manager can do this";
		}else 
			return "failed";
	}

	

	
	public String insertprojectcontants(Project3 pro2)
	{
		int id=pro2.getPid();
		String s="manager";
		String fname1=(String) pro2.getResourcename();
		//String fname2=pro2.getCreatedby();
		 String roles="manager";
		String sql="select count(*) from projects where id=? ";
		@SuppressWarnings("deprecation")
		int obj= jdbcTemplate.queryForObject(sql,
				    new Object[] 
				    {id},Integer.class);
		if(obj >0) {
			String sql1="select count(*) from contacts where role=? and fname=?";
			@SuppressWarnings("deprecation")
			int obj3=jdbcTemplate.queryForObject(sql1,new Object[] {s,fname1},Integer.class );
			if(obj3>0)
			{
		  String sql2="insert into projectcontacts (pid,tid,tname,createdby,startdate,enddate,resourcename) values(?,?,?,?,?,?,?)";
		  int obj2 =jdbcTemplate.update(sql2,pro2.getPid(),pro2.getTid(),pro2.getTname(),pro2.getCreatedby(),pro2.getStartdate(),pro2.getEnddate(),pro2.getResourcename());
			}
         else 
			return "Resource name not matched";
		}
	  else
		  return "ID not matched";
		return "Inserted into ProjectContacts";
		
	}
	
	public List<Project> namesearch(Project pro) {
		
			String sql= "select * from contacts where 1=1";
		
			if(pro.getId()!=0)
			{
				String sql1=" and id="+pro.getId();
				 sql=sql+sql1;
			}
				System.out.println(pro.getFname());
			if(pro.getFname()!=null)
			{
				String s=pro.getFname()+"%";
				String sql2=" and fname LIKE '"+s+"'";
				sql=sql+sql2;
			}
			if(pro.getLname()!=null)
			{
				String s1=pro.getLname()+"%";
				String sql3=" and lname LIKE '"+s1+"'";
				sql=sql+sql3;
		    }
			if(pro.getPhoneno()!=null)
			{
				String sql4=" and phoneno ="+pro.getPhoneno();
			    sql=sql+sql4;
			} 
			if(pro.getEmail()!=null)
			{
				String sql5=" and email= '"+pro.getEmail()+"'";
				sql=sql+sql5;
			}
			if(pro.getRole()!=null)
			{
				String role="manager";
				String role1="employee";
				if(pro.getRole().equals(role))
				{
					String sql6=" and role = '"+pro.getRole()+"'";
				    sql=sql+sql6; 
				}
				else if(pro.getRole().equals(role1))
				{
					String sql7=" and role ='"+pro.getRole()+"'";
					sql=sql+sql7;
				}
				
			}
			//System.out.println(sql);
			return jdbcTemplate.query(sql,(chinni,rowNum)-> new Project
					(
					 chinni.getInt(1),
					 chinni.getString(2),
					 chinni.getString(3),
					 chinni.getString(4),
					 chinni.getString(5),
					 chinni.getString(6))
					);
		}
	
	public List<Project2> projectssearch(Project2 pro) {
		
		String sql= "select * from projects where 1=1";
	
		if(pro.getId()!=0)
		{
			String sql1=" and id="+pro.getId();
			 sql=sql+sql1;
		}
			//System.out.println(pro.getFname());
		if(pro.getName()!=null)
		{
			String s=pro.getName()+"%";
			String sql2=" and Name LIKE '"+s+"'";
			sql=sql+sql2;
		}
		if(pro.getCname()!=null)
		{
			String s1=pro.getCname()+"%";
			String sql3=" and cname LIKE '"+s1+"'";
			sql=sql+sql3;
	    }
		if(pro.getCreatedby()!=null)
		{
			String sql4=" and createdby ='"+pro.getCreatedby()+"'";
		    sql=sql+sql4;
		    System.out.println(sql);
		} 
		if(pro.getStatus()!=null)
		{
			String sql5=" and status= '"+pro.getStatus()+"'";
			sql=sql+sql5;
		}
		
			
		
		//System.out.println(sql);
		return jdbcTemplate.query(sql,(chinni2,rowNum)-> new Project2
				(
				chinni2.getInt(1),
				 chinni2.getString(2),
				 chinni2.getString(3),
				chinni2.getString(4),
				chinni2.getString(5),
				chinni2.getString(6),
				 chinni2.getString(7))
				);
	}
	
public List<Project2> projectcontactssearch(Project2 pro) {
		
		String sql= "select * from projects where 1=1";
	
		if(pro.getId()!=0)
		{
			String sql1=" and id="+pro.getId();
			 sql=sql+sql1;
		}
			//System.out.println(pro.getFname());
		if(pro.getName()!=null)
		{
			String s=pro.getName()+"%";
			String sql2=" and Name LIKE '"+s+"'";
			sql=sql+sql2;
		}
		if(pro.getCname()!=null)
		{
			String s1=pro.getCname()+"%";
			String sql3=" and cname LIKE '"+s1+"'";
			sql=sql+sql3;
	    }
		if(pro.getCreatedby()!=null)
		{
			String sql4=" and createdby ='"+pro.getCreatedby()+"'";
		    sql=sql+sql4;
		    System.out.println(sql);
		} 
		if(pro.getStatus()!=null)
		{
			String sql5=" and status= '"+pro.getStatus()+"'";
			sql=sql+sql5;
		}
		
			
		
		//System.out.println(sql);
		return jdbcTemplate.query(sql,(chinni2,rowNum)-> new Project2
				(
				chinni2.getInt(1),
				 chinni2.getString(2),
				 chinni2.getString(3),
				chinni2.getString(4),
				chinni2.getString(5),
				chinni2.getString(6),
				 chinni2.getString(7))
				);
	}
	
   public List<Project3> projectcontactssearch(Project3 pro) 
   {
	
	   String sql= "select * from projectcontacts where 1=1";
		
		if(pro.getPid()!=0)
		{
			String sql1=" and pid="+pro.getPid();
			 sql=sql+sql1;
		}
			//System.out.println(pro.getFname());
		if(pro.getTid()!=0)
		{
			int s=pro.getTid();
			String sql2=" and tid  ="+s;
			sql=sql+sql2;
		}
		if(pro.getTname()!=null)
		{
			String s1=pro.getTname()+"%";
			String sql3=" and tname LIKE '"+s1+"'";
			sql=sql+sql3;
	    }
		if(pro.getCreatedby()!=null)
		{
			String sql4=" and createdby ='"+pro.getCreatedby()+"'";
		    sql=sql+sql4;
		    System.out.println(sql);
		} 
		if(pro.getResourcename()!=null)
		{
			String sql5=" and status= '"+pro.getResourcename()+"'";
			sql=sql+sql5;
		}
		
			
		
		//System.out.println(sql);
		return jdbcTemplate.query(sql,(chinni3,rowNum)-> new Project3
				(
				chinni3.getInt(1),
				chinni3.getInt(2),
				chinni3.getString(3),
				chinni3.getString(4),
				chinni3.getString(5),
				chinni3.getString(6),
				chinni3.getString(7))
				);
	
}


	 public List<Project4> join(Project4 project)
	 {
		 String sql="SELECT projectcontacts.pid,projects.Name,projects.cname,projects.createdby,projects.startdate,projects.enddate,projects.status,projectcontacts.tid,projectcontacts.tname,projectcontacts.resourcename FROM projectinfo.projects Left join projectinfo.projectcontacts on projects.id=projectcontacts.pid";
		 if(project.getPid()!=0)
		 {
		
			String sql1=" where pid ='"+project.getPid()+"'";
			 sql=sql+sql1;
		 }
		 return jdbcTemplate.query(sql,(chinni1,rowNum)->new Project4
		    		(
		    				chinni1.getInt(1),
		    				chinni1.getString(2),
		    				chinni1.getString(3),
		    				chinni1.getString(4),
		    				chinni1.getString(5),
		    				chinni1.getString(6),
		    				chinni1.getString(7),
		    				chinni1.getInt(8),
		    				chinni1.getString(9),
		    				chinni1.getString(10))
		    		);
	
	 }
	 
	
	 public String update(Project2 project)
	 {
		 String stat=project.getStatus();
		  int pid=project.getId();
		  String admin=project.getCreatedby();
		  //System.out.println(stat);
		 String S="select count(*) from projects where id=? and createdby=?";
		 int obj3=jdbcTemplate.queryForObject(S,new Object[] {pid,admin},Integer.class );
		 if(obj3>0)
		 {
			 String sql=" update projects set status = ? where id=? ";
			 int obj=jdbcTemplate.update(sql,stat,pid);
			 if(obj>0)
				 return "Status Updated Successfully";
			 else
				 return "Status not updated";
		 }
		 else
		 {
			 return "Authorization  Failed";
		 }
		 //return "Status updated successfully";
	 }
	 
	 public int countpro(Project pro)
	 {
		 String sql="select count(id) from contacts ";
		 int count1=jdbcTemplate.queryForObject(sql, new Object[] {} ,Integer.class);
		 return count1;
	 }
	 
	 public int count(Project2 pro)
		{
			String sql= "Select count(createdby) from projects ";
			 @SuppressWarnings("deprecation")
			int count2 = jdbcTemplate.queryForObject(sql,new Object[] {},Integer.class);
		     return count2;
			
		}
	
	 

	public int countprocon(Project3 pro) {
		String sql= "Select count(pid) from projectcontacts ";
		 @SuppressWarnings("deprecation")
		int count3 = jdbcTemplate.queryForObject(sql,new Object[] {},Integer.class);
		// TODO Auto-generated method stub
		return count3;
	}

	

	public List<Project3> employee(Project3 pro) {
		// TODO Auto-generated method stub
		 String s=pro.getResourcename();
			String sql=" Select * from projectcontacts where 1=1";
			System.out.println(sql);
			System.out.println(s);
			 if(pro.getResourcename()!=null)
			 {
			
				String sql1=" and resourcename = '"+pro.getResourcename()+"'";
				 sql=sql+sql1;
			 }
			    return jdbcTemplate.query(sql,(chi,rowNum)->new Project3(
			    		chi.getInt(1),
			    		chi.getInt(2),
			    		chi.getString(3),
			    		chi.getString(4),
			    		chi.getString(7)
			    		)
			    		);
	    }
	
	public List<Project4> join1(Project4 project)
	 {
		 String sql="SELECT projectcontacts.pid,projects.Name,projects.cname,projects.createdby,projects.startdate,projects.enddate,projects.status,projectcontacts.tid,projectcontacts.tname,projectcontacts.resourcename FROM projectinfo.projects Left join projectinfo.projectcontacts on projects.id=projectcontacts.pid";
		 if(project.getCreatedby()!=null)
		 {
		
			String sql1=" where projects.createdby ='"+project.getCreatedby()+"'";
			 sql=sql+sql1;
		 }
		 return jdbcTemplate.query(sql,(chinni1,rowNum)->new Project4
		    		(
		    				chinni1.getInt(1),
		    				chinni1.getString(2),
		    				chinni1.getString(3),
		    				chinni1.getString(4),
		    				chinni1.getString(5),
		    				chinni1.getString(6),
		    				chinni1.getString(7),
		    				chinni1.getInt(8),
		    				chinni1.getString(9),
		    				chinni1.getString(10))
		    		);
		 //System.out.println(sql);
	 }
 
	public String resource(Project5 project) {
		// TODO Auto-generated method stub
		int pid1=project.getPid();
		System.out.println(pid1);
		try {
        String sql1="select id from projects where id ='"+project.getPid()+"'";
        
           int p = jdbcTemplate.queryForObject(sql1,new Object[] {},Integer.class);
           System.out.println(p);
           if(p>0)
           {
         if(pid1==p)  
         {
      	   String sql2 ="select createdby from projects where id ='"+project.getPid()+"'";
      	   String s=jdbcTemplate.queryForObject(sql2,String.class); 
      	   System.out.println("name"+s);
      	   String sql4="select count(fname) from contacts where fname='"+project.getEmployeeName()+"'";
      	   int i=jdbcTemplate.queryForObject(sql4,Integer.class);
      	   System.out.println("emp"+i);
      	   if(i>0)
      	   {
      		   String status1="Not-Assigned";
      		   String status2="Assigned";
      		   String status=null;
      		   String emp=project.getEmployeeName();
      		   System.out.println("next");
      		   String s2=project.getEmployeeName();
      		 String sql6 ="select count(resourcename) from projectcontacts where resourcename ='"+project.getEmployeeName()+"'";
        	   @SuppressWarnings("deprecation")
        	  
			 int val=jdbcTemplate.queryForObject(sql6,Integer.class);
        	  // System.out.println(s1);
        	   //System.out.println(emp); 
        	   if(val>0)
        	       status=status2;
        	   else
        		   status=status1;
      		 String sql3="insert into resource (pid,employeeName,manager,Status) values (?,?,?,?)";
             int obj3=jdbcTemplate.update(sql3,project.getPid(),project.getEmployeeName(),s,status);
             if(obj3>0)
             {
          	   return "Inserted Successfully";
             }
             else 
          	   return "Insertion Failed";
      	   }
      	   else
      		   return "Unauthorized Employee";
             
   		}
         else
         {
      	   return " Project not yet inserted";
         }
           }
           else
           {
        	   return "no projects";
           }
           
	}catch(Exception e)
	{
		System.out.println(e);
		return " "+ e;
	
	}
	}
}
