/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

public class Student extends Person{

    private int year;
    private Professor coordinator;

    public Student() {
        super();
    }

    public Student(String username, String password) {
        super(username, password);
    }

    Student(int studentId) {
        super(studentId);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Professor getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(Professor coordinator) {
        this.coordinator = coordinator;
    }

    public Student(int year, Professor coordinator, String firstName, String lastName, Integer ssn, Date birthDate, String username, String password, BankAccount bankAccount) {
        super(firstName, lastName, ssn, birthDate, username, password, bankAccount);
        this.year = year;
        this.coordinator = coordinator;
    }

    public Student(int year, Professor coordinator, Integer id, String firstName, String lastName, Integer ssn, Date birthDate, String username, String password, BankAccount bankAccount) {
        super(id, firstName, lastName, ssn, birthDate, username, password, bankAccount);
        this.year = year;
        this.coordinator = coordinator;
    }
    
}
