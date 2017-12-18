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
public class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        shapeName = "CIRCLE";
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
