/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.gui.demo;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 *
 * @author kmhasan
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField taskIdField;
    @FXML
    private TextField taskNameField;
    @FXML
    private TextField todoIdField;

    private final String HOSTNAME = "172.17.0.134";
    private final String DBNAME = "tododb";
    private final String USERNAME = "cse2015fall2017";
    private final String PASSWORD = "java";
    private final String DBURL = "jdbc:mysql://" + HOSTNAME + "/" + DBNAME;
    @FXML
    private Label statusLabel;
    @FXML
    private ListView<TodoTask> todoTaskListView;
    private ObservableList<TodoTask> todoTaskList;
    @FXML
    private TableView<TodoTask> todoTaskTableView;
    @FXML
    private TableColumn<TodoTask, Number> taskIdColumn;
    @FXML
    private TableColumn<TodoTask, String> taskNameColumn;
    @FXML
    private TableColumn<TodoTask, Number> todoIDColumn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        todoTaskList = FXCollections.observableArrayList();
        todoTaskListView.setItems(todoTaskList);
        todoTaskTableView.setItems(todoTaskList);
        
        // lambda expression
        // we need StringProperty instead of String
        taskNameColumn
            .setCellValueFactory(
                data -> 
                    new SimpleStringProperty(
                        data.getValue().getTaskName()));
        taskIdColumn
            .setCellValueFactory(
                data ->
                    new SimpleIntegerProperty(
                        data.getValue().getTaskId()));
        
        todoIDColumn
            .setCellValueFactory(
                data ->
                    new SimpleIntegerProperty(
                        data.getValue().getTodoId()));
        try {
            Connection connection = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
            statusLabel.setText("Connection OKAY");

            Statement statement = connection.createStatement();

            String query = "select id, task, todoId from todotask;";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int taskId = resultSet.getInt("id");
                String taskName = resultSet.getString("task");
                int todoId = resultSet.getInt("todoId");
                TodoTask t = new TodoTask(taskId, taskName, todoId);
                todoTaskList.add(t);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void handleAddTaskAction(ActionEvent event) {
        try {
            Connection connection = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
            statusLabel.setText("Connection OKAY");

            Statement statement = connection.createStatement();

            // inserting data
            int taskId = Integer.parseInt(taskIdField.getText());
            String taskName = taskNameField.getText();
            int todoId = Integer.parseInt(todoIdField.getText());
            String query = "insert into todotask values(" + taskId + ", '" + taskName + "', " + todoId + ");";
            int row = statement.executeUpdate(query);
            statusLabel.setText("Inserted task with id " + taskId);
            todoTaskList.add(new TodoTask(taskId, taskName, todoId));
            resetForm();
        } catch (SQLException ex) {
            Alert alert = new Alert(AlertType.ERROR, "Something went wrong");
            alert.show();
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException nfe) {
            Alert alert = new Alert(AlertType.ERROR, "You're supposed to enter numbers in the id fields");
            alert.show();
        }

    }

    private void resetForm() {
        taskIdField.clear();
        taskNameField.clear();
        todoIdField.clear();
    }

}
