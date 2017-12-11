/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.console.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author kmhasan
 */
public class DBConsoleDemo {
    private final String HOSTNAME = "172.17.0.134";
    private final String DBNAME = "tododb";
    private final String USERNAME = "cse2015fall2017";
    private final String PASSWORD = "java";
    private final String DBURL = "jdbc:mysql://" + HOSTNAME + "/" + DBNAME;

    public DBConsoleDemo() {
        try {
            Connection connection = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
            System.out.println("Connection OKAY");
            
            Statement statement = connection.createStatement();
            
            /*
            // inserting data
            String query = "insert into todotask values(5, 'Buy prizes', 1);";
            int row = statement.executeUpdate(query);
            System.out.println("Rows affected " + row);
            */
            
            // retrieving data
            String query = "select id, task from todotask;";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int taskId = resultSet.getInt("id");
                String taskName = resultSet.getString("task");
                System.out.println(taskId + " " + taskName);
            }
        } catch (SQLException sqle) {
            System.err.println(sqle);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new DBConsoleDemo();
    }
    
}
