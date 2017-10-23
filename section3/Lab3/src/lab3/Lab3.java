/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author kmhasan
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point p1 = new Point(4, 5);
        Point p2 = new Point(3, 2);
        
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        
        double d = p1.distance(p2);
        
        p1.translate(10, -2);
        System.out.println("After translate: " + p1);
        
        p1.rotate(10);
        System.out.println("After rotate: " + p1);
        
        p1.scale(2, 0.5);
        System.out.println("After scale: " + p1);
        
    }
    
}
