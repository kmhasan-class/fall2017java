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
    private Course courses[];
    private int courseCount;

    public Student() {
        courses = new Course[5];
    }

    public Student(int studentId, String studentName) {
        this();
        this.studentId = studentId;
        this.studentName = studentName;
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
        courseCount++;
    }
    
    public double getTotalCredits() {
        double sum = 0.0;
        for (int i = 0; i < courseCount; i++)
            sum = sum + courses[i].getCredits();
        return sum;
    }
}
