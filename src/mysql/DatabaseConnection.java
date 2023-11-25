package mysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    private final String driver;
    private final String dbName;
    private final String connectionURL;
    private final String ssl;
    private final String username;
    private final String password;

    public DatabaseConnection() {
        driver = "com.mysql.jdbc.Driver";
        connectionURL = "jdbc:mysql://localhost:3306/";
        dbName = "project_imdb";
        ssl = "?autoReconnect=true&useSSL=false";
        username = "root";
        password = "nuamuitatparola";
    }

    public Connection getConnection() throws Exception {
        Class.forName(driver);

        return DriverManager.getConnection(connectionURL + dbName + ssl, username, password);
    }

    public static void main(String[] args) {
        DatabaseConnection db = new DatabaseConnection();
        try {
            Connection conn = db.getConnection();
            System.out.println("Database successfully connected!");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//mysql:mysql-connector-java:5.1.46