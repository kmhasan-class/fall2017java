/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.console.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author kmhasan
 */
public class DatabaseConsoleDemo {
    private final String HOSTNAME = "172.17.0.134";
    private final String USERNAME = "dummyuser";
    private final String PASSWORD = "pass";
    private final String DBNAME = "dummydb";
    private final String DBURL = "jdbc:mysql://" + HOSTNAME + "/" + DBNAME;
    
    public DatabaseConsoleDemo() {
        String query = "SELECT id, name FROM student;";
        try {
            Connection c = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(query);
            
            while (r.next()) {
                int id = r.getInt("id");
                String name = r.getString("name");
                System.out.println(id + ", " + name);
            }
        } catch (SQLException sqle) {
            System.err.println(sqle);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new DatabaseConsoleDemo();
    }
    
}
