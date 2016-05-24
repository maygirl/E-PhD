/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Course {

    private Integer id;
    private String name;
    private String domain;
    private Professor proffesor;

    public Course() {
    }

    public Course(Integer id) {
        this.id = id;
    }

    public Course(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Professor getProfessor() {
        return proffesor;
    }

    public void setProfessor(Professor proffesor) {
        this.proffesor = proffesor;
    }

    public Course(String name, String domain, Professor proffesor) {
        this.name = name;
        this.domain = domain;
        this.proffesor = proffesor;
    }

    public Course(Integer id, String name, String domain, Professor proffesor) {
        this.id = id;
        this.name = name;
        this.domain = domain;
        this.proffesor = proffesor;
    }
    
}
