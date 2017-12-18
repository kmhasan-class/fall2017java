/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author kmhasan
 */
public class FXMLDocumentController implements Initializable {
    private final String DBNAME     = "dummydb";
    private final String HOSTNAME   = "172.17.0.134";
    private final String USERNAME   = "dummyuser";
    private final String PASSWORD   = "pass";
    private final String DBURL      = "jdbc:mysql://" + HOSTNAME + "/" + DBNAME;
    
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleLoginAction(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();
        
        try {
            Connection c = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
            Statement s = c.createStatement();
            
            String query = "SELECT * FROM user WHERE username = '" + username + "' AND password = md5('" + password + "');";
            //System.out.println(query);
            
            ResultSet r = s.executeQuery(query);
            
            if (r.next())
                System.out.println("Login successful");
            else System.out.println("Wrong username/password");
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
}
