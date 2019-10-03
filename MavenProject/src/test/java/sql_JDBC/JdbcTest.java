package sql_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.protocol.Resultset;

public class JdbcTest {
  @Test
  public void f() throws Exception {
	  String dbURL,username,password;
	  dbURL="jdbc:mysql://localhost:3306/oranges";
	  username="root";
	  password="root";
     Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection conn=DriverManager.getConnection(dbURL,username,password);
	  Statement st=conn.createStatement();
	  ResultSet rs=st.executeQuery("select * from Job");
	  while(rs.next())
		  
	  {
		  System.out.println("the employee id is "+rs.getString("JOB_ID"));
		  System.out.println("the employee function  is "+rs.getString("function"));

		  
	  }
	  
  conn.close();
}
 
}
