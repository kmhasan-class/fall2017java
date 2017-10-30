/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author kmhasan
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s = new Student(12, "John Doe");
        
        Course c1 = new Course("CSE1011", "C", 3);
        Course c2 = new Course("CSE1012", "C Lab", 1);
        Course c3 = new Course("ENG1001", "Basic Composition", 0);
        Course c4 = new Course("MATH1024", "Coordinate Geometry", 3);
        Course c5 = new Course("SOC2031", "Engineering Ethics", 3);
        Course c6 = new Course("EEE2011", "Devices", 3);
        // Hometask: fix your code so that it doesn't
        // accept more than 5 courses per student
        
        s.addCourse(c1);
        s.addCourse(c2);
        s.addCourse(c3);
        s.addCourse(c4);
        s.addCourse(c5);
        //s.addCourse(c6);
        
        System.out.println(s);
        System.out.println(s.getTotalCredits());
    }
    
}
