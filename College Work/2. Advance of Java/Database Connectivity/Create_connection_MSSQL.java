

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;


public class Create_connection_MSSQL{

    public static void main(String[] args){

        try {
            // option1
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Connecting...");
            String connectionUrl = "jdbc:sqlserver://MOHIT-PC:1433; databaseName=Employee;user=sa;password=mohit;encrypt=true; trustServerCertificate=true"; 
            Connection con= DriverManager.getConnection(connectionUrl);

            if(con!=null){
                System.out.println("connected");
            }

            String str="select * from employee";

            PreparedStatement p=con.prepareStatement(str); 
            ResultSet rs=p.executeQuery();

            while(rs.next()){
                System.out.println(rs.getString(1)+"\t"+rs.getString(2)+
                "\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
            } 
            con.close();

        } 
        catch (Exception e) {
        System.out.println("connection failed\n" + e);
        }
    }
}