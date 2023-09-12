import java.sql.*;

public class SQLServerJDBCExample {
    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Employee;user=sqlsever;password=mohit;";

        try {
            // Load the JDBC driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Establish the connection
            Connection connection = DriverManager.getConnection(connectionUrl);

            // Execute a query
            // String sql = "SELECT * FROM YourTableName";
            // Statement statement = connection.createStatement();
            // ResultSet resultSet = statement.executeQuery(sql);
            System.out.println("OK");
            // Process the result set
            // while (resultSet.next()) {
            //     String column1 = resultSet.getString("Column1");
            //     String column2 = resultSet.getString("Column2");
            //     // Process the retrieved data
            // }

            // Close the connections
            // resultSet.close();
            // statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
