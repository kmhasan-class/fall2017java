/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism.demo;

import java.util.ArrayList;

/**
 *
 * @author kmhasan
 */
public class PolymorphismDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Rectangle(4, 5);
        Shape s3 = new Circle(4);
        ArrayList<Shape> shapeList = new ArrayList<>();
        shapeList.add(s1);
        shapeList.add(s2);
        shapeList.add(s3);
        
        for (int i = 0; i < shapeList.size(); i++)
            System.out.println(shapeList.get(i).getArea());
    }
    
}
