/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

/**
 *
 * @author kmhasan
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Canvas drawingCanvas;
    private GraphicsContext gc;
    
    private void drawGrid(double dx, double dy, Color color) {
        gc.setStroke(color);
        for (int i = 0; i <= drawingCanvas.getWidth() / dx; i++)
            gc.strokeLine(i * dx, 0, i * dx, drawingCanvas.getHeight());
        for (int i = 0; i <= drawingCanvas.getHeight() / dy; i++)
            gc.strokeLine(0, i * dy, drawingCanvas.getWidth(), i * dy);
    }
    
    private void drawBangladeshFlag() {
        Color green = Color.rgb(0, 103, 71);
        gc.setFill(green);
        gc.fillRect(0, 0, 500, 300);
        
        Color red = Color.rgb(218, 41, 28);
        gc.setFill(red);
        gc.fillOval(225 - 100, 150 - 100, 200, 200);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        gc = drawingCanvas.getGraphicsContext2D();
        //gc.strokeRect(10, 10, 300, 200);
        //gc.strokeOval(10, 10, 300, 300);
        //gc.strokeLine(0, 0, drawingCanvas.getWidth(), drawingCanvas.getHeight());
        drawGrid(20, 20, Color.LIGHTGRAY);
        drawGrid(100, 100, Color.GRAY);
        drawBangladeshFlag();
    }    


}
