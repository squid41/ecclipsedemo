package com.student.manage;

import java.sql.*;

public class studentdao {
	   
	public static boolean inserttoDB(student st) {
		boolean f=false;
		try {
			Connection con=ConnectionProvider.createConnection();
			String q="insert into stud(id,name,email) values(?,?,?)";
			PreparedStatement pst=con.prepareStatement(q);
			pst.setInt(1, st.getId());
			pst.setString(2, st.getName());
			pst.setString(3, st.getEmail());
			
			pst.executeUpdate();
			f=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	public static boolean display() {
		boolean f=false;
		try {
			Connection con=ConnectionProvider.createConnection();
			String q="select * from stud";
			Statement pst=con.createStatement();
			ResultSet set=pst.executeQuery(q);
			while(set.next()) {
				int id=set.getInt(1);
			    String name=set.getString(2);
			    String email=set.getString(3);
			    System.out.println(id+" "+name+" "+email);
			}
			
			f=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

}
