package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class updatedemo {
public static void main(String args[])throws Exception {
		
		
		String name1="kunal";
		String email1="jay@gmail.com";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","sanskrutipawar");
		
		PreparedStatement ps=con.prepareStatement("update student set  name=? where email=?");
	    ps.setString(1, name1);
	    ps.setString(2, email1);
	    
	    int count=ps.executeUpdate();
	    if(count>0) {
	    	System.out.println("success");
	    }else {
	    	System.out.println("unsuccess");
	    }

}
}
