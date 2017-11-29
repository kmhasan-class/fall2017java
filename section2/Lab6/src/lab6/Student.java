/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.time.LocalDate;

/**
 *
 * @author kmhasan
 */
public class Student {
    private String studentId;
    private String studentName;
    private LocalDate dateOfBirth;

    public Student() {
    }

    public Student(String studentId, String studentName, LocalDate dateOfbirth) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.dateOfBirth = dateOfbirth;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    
    @Override
    public String toString() {
        return studentId;
    }
   
}
