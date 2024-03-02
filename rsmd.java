import java.sql.*;
public class rsmd {
    public static void main(String[] args){
        String url="jdbc:postgresql://localhost:5432/college";
        String user="postgres";
        String pass="123456";
        try{
            Class.forName("org.postgresql.Driver");
            Connection con=DriverManager.getConnection(url,user,pass);
            PreparedStatement ps=con.prepareStatement("select * from college_details");
            ResultSet rs=ps.executeQuery();
            ResultSetMetaData rsmd= rs .getMetaData();

            System.out.println("total columns:" +rsmd.getColumnCount());
            System.out.println("column name of 1st column:" +rsmd.getColumnName(1));
            System.out.println("column  type name of 1st column:" +rsmd.getColumnTypeName(1));


            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

