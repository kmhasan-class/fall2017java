/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract.classes.demo;

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
       
        Shape s2 = new Circle(10);
        
        System.out.println(s1);
        System.out.println(s2);
    }
    
}
