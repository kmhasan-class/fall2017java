/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.console.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
