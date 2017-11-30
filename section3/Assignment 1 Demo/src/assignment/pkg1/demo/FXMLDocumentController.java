/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1.demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

/**
 *
 * @author kmhasan
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private ListView<Todo> listView;
    private ObservableList<Todo> itemList;
    private ObservableList<String> todoList;
    private ObservableList<String> completedList;
    @FXML
    private DatePicker datePicker;
    @FXML
    private TextField titleField;
    @FXML
    private ListView<String> todoListView;
    @FXML
    private ListView<String> completedListView;
    @FXML
    private VBox todoItemVBox;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        itemList = FXCollections.observableArrayList();
        todoList = FXCollections.observableArrayList();
        completedList = FXCollections.observableArrayList();
        
        listView.setItems(itemList);
        todoListView.setItems(todoList);
        completedListView.setItems(completedList);
        
        try (RandomAccessFile input
                = new RandomAccessFile("todolist.txt", "r")) {
            while (true) {
                String date = input.readLine();
                if (date == null)
                    break;
                String title = input.readLine();
                Todo todo = new Todo(LocalDate.parse(date), title);
                itemList.add(todo);
                String todoItem;
                while ((todoItem = input.readLine()) != null) {
                    if (todoItem.equals("#")) {
                        break;
                    }
                    todo.getTodoItemList().add(todoItem);
                    //System.out.println("Todo: " + todoItem);
                }

                String completedItem;
                while ((completedItem = input.readLine()) != null) {
                    if (completedItem.equals("##")) {
                        break;
                    }
                    todo.getCompletedItemList().add(completedItem);
                    //System.out.println("Completed: " + completedItem);
                }
                
                //System.out.println(todo);
            }
        } catch (FileNotFoundException fnfe) {

        } catch (IOException ioe) {

        }
        
    }

    @FXML
    private void handleItemSelection(MouseEvent event) {
        Todo todo = listView.getSelectionModel().getSelectedItem();
        if (todo != null) {
            titleField.setText(todo.getTitle());
            datePicker.setValue(todo.getDate());
            todoList.clear();
            todoList.addAll(todo.getTodoItemList());
            completedList.clear();
            completedList.addAll(todo.getCompletedItemList());
            
            todoItemVBox.getChildren().clear();
            for (int i = 0; i < todo.getTodoItemList().size(); i++) {
                String s = todo.getTodoItemList().get(i);
                CheckBox c = new CheckBox(s);
                c.setSelected(true);
                todoItemVBox.getChildren().add(c);
                
                // HINT: programmatically add event handler
                // to the checkbox
                c.setOnAction(click -> {
                    System.out.println(c.getText());
                    completedList.add(s);
                });
            }
        }
    }

}
