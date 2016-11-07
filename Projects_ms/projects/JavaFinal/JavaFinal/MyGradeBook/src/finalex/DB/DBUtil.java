/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalex.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author lcotti
 */
public class DBUtil {
    private static Connection connection;
    
    private DBUtil() {}

    public static synchronized Connection getConnection() throws DBException {
        if (connection != null) {
            return connection;
        }
        else { // connecting to the database server 
            try {
                // set the db url, username, and password
                String url = "jdbc:mysql://localhost:3306/GradeBook"; // the schema used is Gradebook
                String username = "mgb";
                String password = "72801";

                // get and return connection
                connection = DriverManager.getConnection( // connections made using the DriverManager.
                        url, username, password);
                return connection; // returing connections to the calling method.
            } catch (SQLException e) {
                throw new DBException(e);
            }            
        }
    }
    
    public static synchronized void closeConnection() throws DBException {
        if (connection != null) {
            try { // closing the connections.
                connection.close();
            } catch (SQLException e) {
                throw new DBException(e);
            } finally {
                connection = null;                
            }
        }
    }
}
