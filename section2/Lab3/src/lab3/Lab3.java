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
        ComplexNumber a = new ComplexNumber(4, 3);
        ComplexNumber b = new ComplexNumber(6, 2);
                
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        
        ComplexNumber c;
        
        c = a.add(b);
        System.out.println("Add: " + c);
        
        c = a.subtract(b);
        System.out.println("Subtract: " + c);
        
        c = a.multiply(b);
        System.out.println("Multiply: " + c);
        
        c = a.divide(b);
        System.out.println("Divide: " + c);
        
    }
    
}
