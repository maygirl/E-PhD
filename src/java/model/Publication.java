/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

public class Publication{

    private Integer id;
    private String title;
    private String domain;
    private Date date;
    private boolean thesis;
    private String path;
    private Student student;
    private Comment comment;

    public Publication() {
    }

    public Publication(Integer id) {
        this.id = id;
    }

    public Publication(Integer id, String title, Date date, boolean thesis, String path) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.thesis = thesis;
        this.path = path;
    }

    public Publication(String title, String domain, int studentId, String filePath) {
        this.title = title;
        this.domain = domain;
        this.student = new Student(studentId);
        this.path = filePath;    
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean getThesis() {
        return thesis;
    }

    public void setThesis(boolean thesis) {
        this.thesis = thesis;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Publication(String title, String domain, Date date, boolean thesis, String path, Student student, Comment comment) {
        this.title = title;
        this.domain = domain;
        this.date = date;
        this.thesis = thesis;
        this.path = path;
        this.student = student;
        this.comment = comment;
    }

    public Publication(Integer id, String title, String domain, Date date, boolean thesis, String path, Student student, Comment comment) {
        this.id = id;
        this.title = title;
        this.domain = domain;
        this.date = date;
        this.thesis = thesis;
        this.path = path;
        this.student = student;
        this.comment = comment;
    }
    
}
