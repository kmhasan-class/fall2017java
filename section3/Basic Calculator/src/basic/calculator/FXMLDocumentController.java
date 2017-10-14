/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author kmhasan
 */
public class FXMLDocumentController implements Initializable {
    String operation;
    int number1;
    int number2;
    /*
    MVC - Model, View, Controller
     */
    @FXML
    private TextField displayField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void handleOneAction(ActionEvent event) {
        String oldText = displayField.getText();
        String newText = oldText + "1";
        displayField.setText(newText);
    }

    @FXML
    private void handleTwoAction(ActionEvent event) {
        String oldText = displayField.getText();
        String newText = oldText + "2";
        displayField.setText(newText);
    }

    @FXML
    private void handleClearAction(ActionEvent event) {
        // Home work
        // we need to get rid of the last character
        // of the string and then set it back

        // Hint: use substring
        // search on google for "Java String API"
        String oldText = displayField.getText();
        if (oldText.length() >= 1) {
            String newText = oldText.substring(0, oldText.length() - 1);
            displayField.setText(newText);
        }
    }

    @FXML
    private void handleAllClearAction(ActionEvent event) {
        displayField.clear();
    }

    @FXML
    private void handleThreeAction(ActionEvent event) {
        String oldText = displayField.getText();
        String newText = oldText + "3";
        displayField.setText(newText);
    }

    @FXML
    private void handleAddAction(ActionEvent event) {
        String oldText = displayField.getText();
        number1 = Integer.parseInt(oldText);
        operation = "ADD";
        displayField.clear();
    }

    @FXML
    private void handleEqualAction(ActionEvent event) {
        String oldText = displayField.getText();
        number2 = Integer.parseInt(oldText);
        
        switch (operation) {
            case "ADD":
                int result = number1 + number2;
                displayField.setText("" + result);
                break;
            case "SUBTRACT":
                break;
            default:
                break;
        }
    }

}
