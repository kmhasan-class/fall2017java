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
public abstract class Shape extends Object {
    protected String shapeName;

    public Shape() {
        shapeName = "SHAPE";
    }
    
    public abstract double getPerimeter();
    
    public abstract double getArea();

    @Override
    public String toString() {
        return shapeName + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }
    
    
}
