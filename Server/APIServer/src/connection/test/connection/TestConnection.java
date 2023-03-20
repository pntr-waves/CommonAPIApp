package connection.test.connection;

import java.sql.Connection;
import java.sql.SQLException;

import connection.PostgreConnection;

public class TestConnection {
    public static void testConnection () throws SQLException {
        Connection connection = PostgreConnection.getPostgreConnection("ManageCustomer");
        System.out.println("connection " +  connection.getCatalog());
    }
    
    public static void main(String[] args) {
        try {
            testConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
} 
