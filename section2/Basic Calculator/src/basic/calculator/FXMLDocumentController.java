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
    
}
