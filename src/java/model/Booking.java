/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Booking {

    private Integer id;
    private Integer nights;
    private String hotel;
    private String location;

    public Booking() {
    }

    public Booking(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNights() {
        return nights;
    }

    public void setNights(Integer nights) {
        this.nights = nights;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Booking(Integer nights, String hotel, String location) {
        this.nights = nights;
        this.hotel = hotel;
        this.location = location;
    }

    public Booking(Integer id, Integer nights, String hotel, String location) {
        this.id = id;
        this.nights = nights;
        this.hotel = hotel;
        this.location = location;
    }

}
