package connection;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConnection extends SQLException{
    public static Connection getConnection (String dbName) throws SQLException {
        return PostgreConnection.getPostgreConnection(dbName);
    }
}
