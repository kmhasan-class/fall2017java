/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author kmhasan
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private ListView<Student> listView;
    private ObservableList<Student> studentList;
    @FXML
    private TextField idField;
    @FXML
    private TextField nameField;
    @FXML
    private DatePicker dobDatePicker;
    private Student selectedStudent;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        studentList = FXCollections.observableArrayList();
        listView.setItems(studentList);

        try {
            RandomAccessFile input = new RandomAccessFile("students.txt", "r");

            while (true) {
                String id = input.readLine();
                if (id == null) {
                    break;
                }
                String name = input.readLine();
                LocalDate dob = LocalDate.parse(input.readLine());

                Student student = new Student(id, name, dob);
                studentList.add(student);
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println("File not found");
        } catch (IOException ioe) {
            System.err.println("IOException");
        }
    }

    @FXML
    private void handleStudentSelectionAction(MouseEvent event) {
        Student s = listView.getSelectionModel().getSelectedItem();
        if (s != null) {
            idField.setText(s.getStudentId());
            nameField.setText(s.getStudentName());
            dobDatePicker.setValue(s.getDateOfBirth());
            selectedStudent = s;
        }
    }

    @FXML
    private void handleNewAction(ActionEvent event) {
        Student s = new Student();
        studentList.add(s);
        selectedStudent = s;
        listView.getSelectionModel().select(s);
        clearForm();
    }

    private void clearForm() {
        idField.clear();
        nameField.clear();
        dobDatePicker.setValue(null);
    }

    @FXML
    private void handleResetAction(ActionEvent event) {
        clearForm();
    }

    @FXML
    private void handleSaveAction(ActionEvent event) {
        String id = idField.getText();
        String name = nameField.getText();
        LocalDate dob = dobDatePicker.getValue();

        if (selectedStudent != null) {
            selectedStudent.setStudentId(id);
            selectedStudent.setStudentName(name);
            selectedStudent.setDateOfBirth(dob);

            try {
                RandomAccessFile output = new RandomAccessFile("students.txt", "rw");
                output.setLength(0);
                for (int i = 0; i < studentList.size(); i++) {
                    Student s = studentList.get(i);
                    output.writeBytes(s.getStudentId() + "\n");
                    output.writeBytes(s.getStudentName() + "\n");
                    output.writeBytes(s.getDateOfBirth() + "\n");
                }
            } catch (FileNotFoundException fnfe) {
                System.err.println("File not found");
            } catch (IOException ioe) {
                System.err.println("IOException");
            }
        }
    }

}
