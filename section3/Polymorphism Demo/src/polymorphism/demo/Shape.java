/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism.demo;

/**
 *
 * @author kmhasan
 */
public abstract class Shape {
    public abstract double getArea();
    
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" + " A: " + this.getArea() + " P: " + this.getPerimeter() + '}';
    }
    
    
}
