package project.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static DatabaseConnection instance;
    private static Connection connection;
    private String url = "jdbc:mysql://localhost:3306/mydb";
    private String username = "root";
    private String password = "root";
    private static Object mutex = new Object();

    private DatabaseConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Failed : " + ex.getMessage());
        }
    }

    public static Connection getConnection() throws SQLException{
        return connection;
    }

    public static DatabaseConnection getInstance() throws SQLException {
        if (instance == null) {
            synchronized (mutex) {
                instance = new DatabaseConnection();
            }
        } else if (instance.getConnection().isClosed()) {
            instance = new DatabaseConnection();
        }

        return instance;
    }
}