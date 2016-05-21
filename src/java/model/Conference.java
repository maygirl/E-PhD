/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Conference {

    private Integer id;
    private String name;
    private String domain;
    private String location;

    public Conference() {
    }

    public Conference(Integer id) {
        this.id = id;
    }

    public Conference(Integer id, String name) {
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Conference(String name, String domain, String location) {
        this.name = name;
        this.domain = domain;
        this.location = location;
    }

    public Conference(Integer id, String name, String domain, String location) {
        this.id = id;
        this.name = name;
        this.domain = domain;
        this.location = location;
    }
    
}
