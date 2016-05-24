/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Mac
 */
public class Report {
    private Integer id;
    private Student student;
    private boolean validated;
    private Date date;
    private String content;

    public Report(Student student, boolean validated, Date date, String content) {
        this.student = student;
        this.validated = validated;
        this.date = date;
        this.content = content;
    }

    public Report(Integer id, Student student, boolean validated, Date date, String content) {
        this.id = id;
        this.student = student;
        this.validated = validated;
        this.date = date;
        this.content = content;
    }

    public Report(int student, String content) {
        this.student = new Student(student);
        this.content = content;
    }

    public Report() {
    }

    
    public Report(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Student getStudent() {
        return student;
    }

    public boolean isValidated() {
        return validated;
    }

    public Date getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setValidated(boolean validated) {
        this.validated = validated;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    
}
