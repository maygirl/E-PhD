/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

public class Student extends Person{

    private int year;
    private Proffesor coordinator;

    public Student() {
        super();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Proffesor getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(Proffesor coordinator) {
        this.coordinator = coordinator;
    }

    public Student(int year, Proffesor coordinator, String firstName, String lastName, Integer ssn, Date birthDate, String username, String password, Proffesor proffesor, BankAccount bankAccount) {
        super(firstName, lastName, ssn, birthDate, username, password, proffesor, bankAccount);
        this.year = year;
        this.coordinator = coordinator;
    }

    public Student(int year, Proffesor coordinator, Integer id, String firstName, String lastName, Integer ssn, Date birthDate, String username, String password, Proffesor proffesor, BankAccount bankAccount) {
        super(id, firstName, lastName, ssn, birthDate, username, password, proffesor, bankAccount);
        this.year = year;
        this.coordinator = coordinator;
    }
    
}
