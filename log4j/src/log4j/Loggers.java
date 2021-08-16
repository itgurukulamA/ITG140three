package log4j;

import java.lang.System.Logger;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.apache.log4j.*;
import com.sun.jdi.connect.spi.Connection;

public class Loggers {
	 static Logger log = Logger.getLogger(Loggers.class);
       public static void main(String args[]) throws SQLException, ClassNotFoundException
       {
    	  try {
    	  // Class.forName("com.mysql.cj.jdbc.Driver");
    	   Connection con=  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mss","root","root");
      	 PreparedStatement ps1 = ((java.sql.Connection) con).prepareStatement("insert into ITG140 (Id,Name,Age,e-mail,PhoneNo) values (1,Jr.Developer,23,dchinni@gmail.com,10000)");
      	int result = ps1.executeUpdate();
       }
    	  catch(Exception e)
    	  {
    		  e.printStackTrace();
    	  }
       }
}
