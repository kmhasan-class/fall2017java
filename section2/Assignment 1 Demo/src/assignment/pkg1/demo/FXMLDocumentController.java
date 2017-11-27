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
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.input.MouseEvent;
/**
 *
 * @author kmhasan
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private ListView<String> listView;
    private ObservableList<String> todoList;
    @FXML
    private ComboBox<String> comboBox;
    @FXML
    private TextField fruitField;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        todoList = FXCollections.observableArrayList();
        try {
            RandomAccessFile input = new RandomAccessFile("todolist.txt", "r");
            
            String line;
            while ((line = input.readLine()) != null) {
                todoList.add(line);
            }
            
        } catch (FileNotFoundException fnfe) {
            System.err.println("File not found!");
        } catch (IOException ex) {
            System.err.println("IOE occured");
        }
        listView.setItems(todoList);
        comboBox.setItems(todoList);
    }    

    @FXML
    private void handleAddFruitAction(ActionEvent event) {
        String fruitName = fruitField.getText();
        todoList.add(fruitName);
    }

    @FXML
    private void handleSelectItemAction(MouseEvent event) {
        String text = listView.getSelectionModel().getSelectedItem();
        fruitField.setText(text);
    }
    
}
