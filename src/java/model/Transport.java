/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Transport {

    private Integer id;
    private Integer type;
    private String duration;

    public Transport() {
    }

    public Transport(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Transport(Integer type, String duration) {
        this.type = type;
        this.duration = duration;
    }

    public Transport(Integer id, Integer type, String duration) {
        this.id = id;
        this.type = type;
        this.duration = duration;
    }

}
