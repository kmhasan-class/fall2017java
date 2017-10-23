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
public class Point {
    private double x;
    private double y;
    
    // Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void translate(double h, double k) {
        this.x = this.x + h;
        this.y = this.y + k;
    }
    
    public void rotate(double thetaInDegrees) {
        // ADD YOUR CODE HERE
        // Hint: use Math.cos(theta) for cos function
        double theta = Math.toRadians(thetaInDegrees);
        //theta = thetaInDegrees * Math.PI / 180.0;
        double xp = x * Math.cos(theta) - y * Math.sin(theta);
        double yp = x * Math.sin(theta) + y * Math.cos(theta);
        x = xp;
        y = yp;
    }
    
    public void scale(double sx, double sy) {
        // ADD YOUR CODE HERE
    }
    
    public double distance(Point that) {
        double d = 0.0;
        double dx = this.x - that.x;
        double dy = this.y - that.y;
        // ADD YOUR CODE HERE
        return d;
    }
    
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
