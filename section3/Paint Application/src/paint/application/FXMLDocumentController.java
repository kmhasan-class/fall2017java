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
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        gc = drawingCanvas.getGraphicsContext2D();
//        gc.setStroke(Color.RED);
//        gc.strokeRect(0, 0, 250, 300);
//        gc.setFill(Color.rgb(178, 28, 234));
//        gc.fillRect(10, 10, 200, 150);
//        gc.strokeLine(0, 0, 125, 300);
        drawGrid(20, 20, Color.LIGHTGRAY);
        drawGrid(100, 100, Color.GRAY);
        
        gc.setFill(Color.RED);
        gc.strokeRect(200, 100, 160, 300);
        gc.fillOval(200, 100, 160, 300);
        
        gc.fillOval(400, 200, 100, 100);
    }    

    private void drawGrid(int dx, int dy, Color color) {
        gc.setStroke(color);
        for (int i = 0; i <= drawingCanvas.getHeight() / dy; i++)
            gc.strokeLine(0, i * dy, drawingCanvas.getWidth(), i * dy);
        for (int i = 0; i <= drawingCanvas.getWidth() / dx; i++)
            gc.strokeLine(i * dx, 0, i * dx, drawingCanvas.getHeight());
    }
    
}
