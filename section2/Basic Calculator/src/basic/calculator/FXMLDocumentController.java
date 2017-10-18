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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author kmhasan
 */
/*
MVC design pattern / framework
M - Model
V - View
C - Controller
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField displayField;
    /*
    Lab task
    Modify the data types to allow for floating point
    calculations. Just change int to double!
     */
    int operand1;
    int operand2;
    String operator;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void handleOneAction(ActionEvent event) {
        String oldText = displayField.getText();
        // string concatenation
        String newText = oldText + "1";
        displayField.setText(newText);
    }

    @FXML
    private void handleTwoAction(ActionEvent event) {
        String oldText = displayField.getText();
        // string concatenation
        String newText = oldText + "2";
        displayField.setText(newText);
    }

    @FXML
    private void handleThreeAction(ActionEvent event) {
        String oldText = displayField.getText();
        // string concatenation
        String newText = oldText + "3";
        displayField.setText(newText);
    }

    @FXML
    private void handleFourAction(ActionEvent event) {
        String oldText = displayField.getText();
        // string concatenation
        String newText = oldText + "4";
        displayField.setText(newText);
    }

    @FXML
    private void handleAdditionAction(ActionEvent event) {
        operand1 = Integer.parseInt(displayField.getText());
        operator = "ADD";
        displayField.setText("");
    }

    @FXML
    private void handleSubtractAction(ActionEvent event) {
        /*
        Lab Task
        When you're reading numbers, you should read double
        Hint: Double.parseDouble
         */
        operand1 = Integer.parseInt(displayField.getText());
        operator = "SUBTRACT";
        displayField.setText("");
    }

    @FXML
    private void handleEqualAction(ActionEvent event) {
        if (operator == null)
            return;
        operand2 = Integer.parseInt(displayField.getText());
        int result = 0;
        switch (operator) {
            case "ADD":
                result = operand1 + operand2;
                break;
            case "SUBTRACT":
                result = operand1 - operand2;
                break;
            /*
                Lab Task
                Add support for MULTIPLY and DIVIDE
                Also for unary operations like SQRT and SQR
                Hint: for SQRT use Math.sqrt
                for SQR just multiply the number by itself
             */
        }
        displayField.setText("" + result);
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
        /*
        Lab Task
        Modify the code to allow a leading zero
        only when it is followed by a dot
        Hint: use the startsWith method (look at the Java API)
        https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
         */
        String oldText = displayField.getText();
        // string concatenation
        String newText = oldText + "0";
        displayField.setText(newText);
    }

    @FXML
    private void handleClearAction(ActionEvent event) {
        /*
        Lab Task
        Clear the rightmost digit
        Hint: use the substring method from the String class
        (again, look at the String API)
         */
        String oldText = displayField.getText();
        if (oldText.length() > 0) {
            String newText = oldText.substring(0, oldText.length() - 1);
            displayField.setText(newText);
        }
    }

    @FXML
    private void handleAllClearAction(ActionEvent event) {
        displayField.setText("");
        //displayField.clear();
    }

    /*
    Lab Task
    Write code for all the remaining buttons
     */
}
