package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class PostgreConnection {
    public static Connection getPostgreConnection (String dbName) throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Properties properties = new Properties();
        properties.put("user", "postgres");
        properties.put("password", "1234");
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbName, properties);
    }
}
