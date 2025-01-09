package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class deletedemo {
	
	public static void main(String args[]) throws Exception
	{
		
		String email1="deepak@gmail.com";
		
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","sanskrutipawar");
	//Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","sanskrutipawar");
	
   PreparedStatement ps=con.prepareStatement("delete from student where email=?");
	 
   ps.setString(1, email1);
	ps.executeUpdate();
	}

}
