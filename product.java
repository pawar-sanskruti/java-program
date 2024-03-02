import java.sql.*;

public class product {
    public static void main(String[] args) throws SQLException {
        // JDBC URL, username, and password of PostgreSQL server
        String url = "jdbc:postgresql://localhost:5432/product";
        String user = "postgres";
        String pass = "123456";
        try
        {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded..");
            Connection con=DriverManager.getConnection(url,user,pass);
            System.out.println("connection establish..");
            Statement st=con.createStatement();
            System.out.println("Statement created..");
            ResultSet rs= st.executeQuery("select * from product_table");
            System.out.println("retrieve data..");
            System.out.println("pid" +"\t\tpname"+"\t\tprice");
            while(rs.next())
            {
                System.out.print(" "+rs.getInt(1));
                System.out.print(" \t"+rs.getString(2));
                System.out.print(" \t\t"+rs.getInt(3));
                System.out.println();
            }
            con.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    }
