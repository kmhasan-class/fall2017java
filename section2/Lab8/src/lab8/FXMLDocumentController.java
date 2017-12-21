/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

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
    
    private void drawStickFigure1() {
        gc.setLineWidth(5);
        gc.setStroke(Color.BLACK);
        // head
        gc.strokeOval(40, 40, 120, 120);
        // left eye
        gc.strokeOval(60, 80, 20, 20);
        // right eye
        gc.strokeOval(120, 80, 20, 20);
        
        gc.strokeLine(100, 160, 100, 260);
        gc.strokeLine(100, 260, 60, 320);
        
        gc.strokeArc(60, 60, 80, 80, 200, 140, ArcType.OPEN);
//        gc.strokeArc(60, 100, 80, 80, 20, 140, ArcType.OPEN);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        gc = drawingCanvas.getGraphicsContext2D();
        drawGrid(20, 20, Color.LIGHTGRAY);
        drawGrid(100, 100, Color.GRAY);
        drawStickFigure1();
    }    
    
}
