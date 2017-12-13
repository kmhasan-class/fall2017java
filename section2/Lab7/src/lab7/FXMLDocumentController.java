/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 *
 * @author kmhasan
 */
public class FXMLDocumentController implements Initializable {
    private final String USERNAME = "dummyuser";
    private final String PASSWORD = "pass";
    private final String DBNAME = "dummydb";
    private final String HOSTNAME = "172.17.0.134";
    private final String DBURL = "mysql:jdbc://" + HOSTNAME + "/" + DBNAME;
    
    private Connection connection;
    private Statement statement;
    
    @FXML
    private TextField productIdField;
    @FXML
    private TextField productNameField;
    @FXML
    private TextField unitPriceField;
    @FXML
    private ComboBox<UnitType> unitTypeComboBox;
    @FXML
    private TableView<Product> productTableView;
    @FXML
    private TableColumn<Product, Number> productIdColumn;
    @FXML
    private TableColumn<Product, String> productNameColumn;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        unitTypeComboBox.setItems(FXCollections.observableArrayList(UnitType.values()));
        
        try {
            Class.forName("com.mysql.jdbc.DriverManager").newInstance();
            connection = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
            System.out.println("Connection okay");
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    @FXML
    private void handleAddProductAction(ActionEvent event) {
    }

    @FXML
    private void handleUpdateProductAction(ActionEvent event) {
    }
    
}
