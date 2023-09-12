import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
// import java.sql.Statement;

public class Coonection_String{
    static final String DB_URL = "jdbc:mysql://localhost:3306/Employee";
    static final String USER = "root"; 
    static final String PASS = "mohit";

    public static void main(String[] args){
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);){ 
        // Statement stmt = conn.createStatement();
        //     String sql = "CREATE DATABASE demo2";
        //     stmt.executeUpdate(sql);
            System.out.println("Connection Established successfully...");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}

