/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Delegation {

    private Integer id;
    private String description;

    public Delegation() {
    }

    public Delegation(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Delegation(String description) {
        this.description = description;
    }

    public Delegation(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

}
