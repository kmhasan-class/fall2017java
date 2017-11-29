/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1.demo;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import java.io.RandomAccessFile;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

/**
 *
 * @author kmhasan
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private ListView<Todo> listView;
    private ObservableList<Todo> todoList;
    @FXML
    private DatePicker datePicker;
    @FXML
    private TextField titleField;
    @FXML
    private ListView<String> todoListView;
    private ObservableList<String> todoItemList;
    @FXML
    private VBox checkBoxVBox;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        todoList = FXCollections.observableArrayList();
        todoItemList = FXCollections.observableArrayList();
        
        try {
            RandomAccessFile input = new RandomAccessFile("todolist.txt", "r");

            while (true) {
                String dateString = input.readLine();
                if (dateString == null)
                    break;
                String titleString = input.readLine();
                Todo t = new Todo(LocalDate.parse(dateString), titleString);

                String line;
                while ((line = input.readLine()) != null) {
                    if (line.equals("#")) {
                        break;
                    }
                    t.getTodoItemList().add(line);
                }

                while ((line = input.readLine()) != null) {
                    if (line.equals("##")) {
                        break;
                    }
                    t.getCompletedItemList().add(line);
                }

                //System.out.println(t);
                todoList.add(t);
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println("File not found!");
        } catch (IOException ex) {
            System.err.println("IOE occured");
        }
        
        listView.setItems(todoList);
        todoListView.setItems(todoItemList);
    }

    @FXML
    private void handleSelectItemAction(MouseEvent event) {
        Todo t = listView.getSelectionModel().getSelectedItem();
        //t.printDetails();
        datePicker.setValue(t.getDate());
        titleField.setText(t.getTitle());
        
        todoItemList.clear();
        todoItemList.addAll(t.getTodoItemList());
        
        checkBoxVBox.getChildren().clear();
        for (int i = 0; i < t.getCompletedItemList().size(); i++) {
            String item = t.getCompletedItemList().get(i);
            checkBoxVBox.getChildren().add(new CheckBox(item));
        }
    }

}
