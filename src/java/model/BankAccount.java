/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class BankAccount{

    private Integer id;
    private String iban;
    private String bankName;
    private String swiftCode;
    private Person owner;

    public BankAccount() {
    }

    public BankAccount(Integer id) {
        this.id = id;
    }

    public BankAccount(Integer id, String iban, Person owner) {
        this.id = id;
        this.iban = iban;
        this.owner = owner;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getSwiftCode() {
        return swiftCode;
    }

    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public BankAccount(String iban, String bankName, String swiftCode, Person owner) {
        this.iban = iban;
        this.bankName = bankName;
        this.swiftCode = swiftCode;
        this.owner = owner;
    }

    public BankAccount(Integer id, String iban, String bankName, String swiftCode, Person owner) {
        this.id = id;
        this.iban = iban;
        this.bankName = bankName;
        this.swiftCode = swiftCode;
        this.owner = owner;
    }
    
}
