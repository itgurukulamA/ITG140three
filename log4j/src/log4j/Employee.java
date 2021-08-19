package log4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.apache.log4j.*;

public class Employee {
	static Logger log = Logger.getLogger(Employee.class);
			
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		BasicConfigurator.configure();
		try{
		log.info("connection established");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema1","root","root");
		System.out.println("connection successful");
		PreparedStatement ps = c.prepareStatement("insert into itg140(id,name,age,email,phonenum) values(2,'bhavani',21,'b@gmail.com',9440715328)");
	    int i = ps.executeUpdate();
         if(i>0) {
        	 log.info("row inserted");
        	 System.out.println("inserted");
		 }else{
			 log.info("row not interested");
		 }
		}catch(Exception e) {
			e.getMessage();
			}
   
		}
}
	
	 




