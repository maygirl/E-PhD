/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Grade {

    private Integer id;
    private int grade;
    private Student student;
    private Course course;

    public Grade() {
    }

    public Grade(Integer id) {
        this.id = id;
    }

    public Grade(Integer id, int grade) {
        this.id = id;
        this.grade = grade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Grade(int grade, Student student, Course course) {
        this.grade = grade;
        this.student = student;
        this.course = course;
    }

    public Grade(Integer id, int grade, Student student, Course course) {
        this.id = id;
        this.grade = grade;
        this.student = student;
        this.course = course;
    }

}
