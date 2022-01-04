package com.student.manage;

import java.sql.*;

public class ConnectionProvider {
	
   static Connection con;
   public static  Connection createConnection(){
	   try {
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   String user="root";
	   String password="Ravinew.2#";
	   String url="jdbc:mysql://localhost:3306/students";
	   con=DriverManager.getConnection(url,user,password);
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   return con;
   }
}
