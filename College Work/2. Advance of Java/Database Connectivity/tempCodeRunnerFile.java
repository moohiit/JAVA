Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            System.out.println("connection successful");

            String server = "MOHIT-PC";
            String database = "Employee"; 
            String password = "mohit";

            String connectionUrl = "jdbc:sqlserver://"+server+":1433; databaseName="+database+";user=sa;password="+password+";encrypt=true; trustServerCertificate=true"; 
            Connection con= DriverManager.getConnection(connectionUrl);
