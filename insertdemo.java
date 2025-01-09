package demo;

  import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insertdemo {
	public static void main(String args[])throws Exception {
		
		
		String name1="kunal";
		String email1="jay@gmail.com";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//System.out.println("driver class loaded successfully");
		
	   Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","sanskrutipawar");
		PreparedStatement ps=con.prepareStatement("insert into student  values('4','jay','jay@gmail.com','jay123','3874587847','nagar','2005/10/23','m','1')");
	   int i=	ps.executeUpdate();
	   /*if(i>0) {
		   System.out.println("success");
	   }else {
		   System.out.println("fail");
	   }*/
	    
	}

}
