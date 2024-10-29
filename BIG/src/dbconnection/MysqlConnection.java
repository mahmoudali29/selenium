package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class MysqlConnection {

    // Database URL, username, and password
    static final String DB_URL = "jdbc:mysql://localhost:3306/big"; // Replace with your database name
    static final String USER = "root"; // Replace with your MySQL username
    static final String PASS = ""; // Replace with your MySQL password

    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt = null;

        try {
            // Register JDBC driver (optional for JDBC 4.0+)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            System.out.println("Connecting to the database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Execute a query
            System.out.println("Creating statement..."); 
            stmt = conn.createStatement();
            String sql = "SELECT * FROM users"; // Replace with your table name
            ResultSet rs = stmt.executeQuery(sql);

            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String email = rs.getString("email");

                // Display values
                System.out.print("ID: " + id);
                System.out.print(", username: " + username);
                System.out.println(", email: " + email);
            }

            // Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Finally block to close resources
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
                se2.printStackTrace();
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
