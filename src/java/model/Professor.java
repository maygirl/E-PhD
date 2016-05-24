/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

public class Professor extends Person{

    private String title;
    private String domain;

    public Professor() {
        super();
    }

    public Professor(String parameter, String parameter0) {
        super(parameter, parameter0);
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

    public Professor(String title, String domain, String firstName, String lastName, Integer ssn, Date birthDate, String username, String password, BankAccount bankAccount) {
        super(firstName, lastName, ssn, birthDate, username, password, bankAccount);
        this.title = title;
        this.domain = domain;
    }

    public Professor(String title, String domain, Integer id, String firstName, String lastName, Integer ssn, Date birthDate, String username, String password, BankAccount bankAccount) {
        super(id, firstName, lastName, ssn, birthDate, username, password, bankAccount);
        this.title = title;
        this.domain = domain;
    }
    
}
