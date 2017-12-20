/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract.classes.demo;

import java.util.ArrayList;

/**
 *
 * @author kmhasan
 */
public class AbstractClassesDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape s1;
        Rectangle r = new Rectangle(10, 20);

        // we can use the reference of the supertype
        // to refer to object of the subtype
        s1 = r;
       
        // POLYMORPHISM
        Shape s2 = new Circle(10);
        
        System.out.println(s1);
        System.out.println(s2);
        
        ArrayList<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Circle(100));
        shapeList.add(new Circle(15));
        shapeList.add(new Circle(12));
        shapeList.add(new Rectangle(20, 10));
        shapeList.add(new Rectangle(20, 15));
        
        double totalArea = 0;
        for (int i = 0; i < shapeList.size(); i++) {
            totalArea = totalArea + shapeList.get(i).getArea();
        }
        
        double averageArea = totalArea / shapeList.size();
        System.out.println("Average area " + averageArea);
    }
    
}
