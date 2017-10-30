/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Arrays;

/**
 *
 * @author kmhasan
 */
public class Student {
    private int studentId;
    private String studentName;
    private Course[] courses;
    private int courseCount;

    public Student() {
        this.courses = new Course[5];
        this.courseCount = 0;
    }

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.courses = new Course[5];
        this.courseCount = 0;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentName=" + studentName + ", courses=" + Arrays.toString(courses) + ", courseCount=" + courseCount + '}';
    }
    
    public void addCourse(Course course) {
        courses[courseCount] = course;
        courseCount = courseCount + 1;
    }
    
    public double getTotalCredits() {
        double totalCredits = 0.0;
        for (int i = 0; i < courseCount; i++)
            totalCredits = totalCredits + courses[i].getCredits();
        return totalCredits;
    }
}
