/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.gui.demo;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 *
 * @author kmhasan
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private ListView<Student> studentListView;
    private ObservableList<Student> studentList;

    private final String HOSTNAME = "172.17.0.134";
    private final String USERNAME = "dummyuser";
    private final String PASSWORD = "pass";
    private final String DBNAME = "dummydb";
    private final String DBURL = "jdbc:mysql://" + HOSTNAME + "/" + DBNAME;
    @FXML
    private TextField studentIdField;
    @FXML
    private TextField studentNameField;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        studentList = FXCollections.observableArrayList();
        studentListView.setItems(studentList);
        
        String query = "SELECT id, name FROM student;";
        try {
            Connection c = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(query);
            
            while (r.next()) {
                int id = r.getInt("id");
                String name = r.getString("name");
                Student student = new Student(id, name);
                studentList.add(student);
            }
        } catch (SQLException sqle) {
            System.err.println(sqle);
        }
    }    

    @FXML
    private void handleAddStudentAction(ActionEvent event) {
        int studentId = Integer.parseInt(studentIdField.getText());
        String studentName = studentNameField.getText();

        String query = "insert into student values(" + studentId +", '" + studentName +"');";
        try {
            Connection c = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
            Statement s = c.createStatement();
            s.executeUpdate(query);

            Student student = new Student(studentId, studentName);
            studentList.add(student);
        } catch (SQLException sqle) {
            System.err.println(sqle);
        }
    }
}
