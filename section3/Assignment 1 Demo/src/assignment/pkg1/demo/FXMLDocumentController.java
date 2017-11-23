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
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 *
 * @author kmhasan
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private ListView<String> listView;
    private ObservableList<String> itemList;
    @FXML
    private TextField itemField;
    
    @FXML
    public void handleAddItem(ActionEvent event) {
        String itemName = itemField.getText();
        itemList.add(itemName);
        itemField.clear();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        itemList = FXCollections.observableArrayList();
        itemList.add("BLACK");
        itemList.add("RED");
        itemList.add("YELLOW");
        
        listView.setItems(itemList);
    }    
    
}
