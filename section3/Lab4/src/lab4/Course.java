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
public class Course {
    private String courseCode;
    private String courseTitle;
    private double credits;

    // We can use NetBeans to generate the Get methods, Constructor, toString
    // Alt + Insert -> Getter
    // Alt + Insert -> Constructor
    // Alt + Insert -> toString

    public Course(String courseCode, String courseTitle, double credits) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.credits = credits;
    }

    public Course() {
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public double getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return "Course{" + "courseCode=" + courseCode + ", courseTitle=" + courseTitle + ", credits=" + credits + '}';
    }

    
}
