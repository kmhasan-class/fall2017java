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
    double number1;
    double number2;
    boolean hasPartialComputation = false;

    /*
    MVC - Model, View, Controller
     */
    @FXML
    private TextField displayField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    // write methods for other digit buttons
    // and other operations (+, -, x, /)
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
        if (!hasPartialComputation) {
            String oldText = displayField.getText();
            number1 = Double.parseDouble(oldText);
            operation = "ADD";
            displayField.clear();
            hasPartialComputation = true;
        } else {
            String oldText = displayField.getText();
            number2 = Double.parseDouble(oldText);

            double result = 0;
            switch (operation) {
                case "ADD":
                    result = number1 + number2;
                    displayField.setText("" + result);
                    break;
                case "SUBTRACT":
                    result = number1 - number2;
                    displayField.setText("" + result);
                    break;
                case "DIVIDE":
                    result = number1 / number2;
                    displayField.setText("" + result);
                    break;
                case "MULTIPLY":
                    result = number1 * number2;
                    displayField.setText("" + result);
                    break;
                default:
                    break;
            }
            hasPartialComputation = false;
        }
    }

    @FXML
    private void handleEqualAction(ActionEvent event) {
        if (operation == null)
            return;
        
        String oldText = displayField.getText();
        number2 = Double.parseDouble(oldText);

        double result;
        switch (operation) {
            case "ADD":
                result = number1 + number2;
                displayField.setText("" + result);
                break;
            case "SUBTRACT":
                result = number1 - number2;
                displayField.setText("" + result);
                break;
            case "DIVIDE":
                result = number1 / number2;
                displayField.setText("" + result);
                break;
            case "MULTIPLY":
                result = number1 * number2;
                displayField.setText("" + result);
                break;
            default:
                break;
        }
    }

    @FXML
    private void handleDivideAction(ActionEvent event) {
        String oldText = displayField.getText();
        number1 = Double.parseDouble(oldText);
        operation = "DIVIDE";
        displayField.clear();
    }

    @FXML
    private void handleDotAction(ActionEvent event) {
        String oldText = displayField.getText();
        if (!oldText.contains(".")) {
            String newText = oldText + ".";
            displayField.setText(newText);
        }
    }

    @FXML
    private void handleZeroAction(ActionEvent event) {
        // Handle it the same way as for other digits
        // Except for leading zeroes for integers must be avoided
        // For floating point numbers there can be one leading zero but not more
        // Hint: use startsWith method in the String class
    }

    @FXML
    private void handleSqrtAction(ActionEvent event) {
        // Compute the square root
        // Hint: use Math.sqrt method
    }

}
