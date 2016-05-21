/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class TravelDocument {

    private Integer id;
    private Student student;
    private Conference conference;
    private Booking booking;
    private Transport transport;
    private Delegation delegation;

    public TravelDocument() {
    }

    public TravelDocument(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Conference getConference() {
        return conference;
    }

    public void setConference(Conference conference) {
        this.conference = conference;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Delegation getDelegation() {
        return delegation;
    }

    public void setDelegation(Delegation delegation) {
        this.delegation = delegation;
    }

    public TravelDocument(Student student, Conference conference, Booking booking, Transport transport, Delegation delegation) {
        this.student = student;
        this.conference = conference;
        this.booking = booking;
        this.transport = transport;
        this.delegation = delegation;
    }
    
    public TravelDocument(Integer id, Student student, Conference conference, Booking booking, Transport transport, Delegation delegation) {
        this.id = id;
        this.student = student;
        this.conference = conference;
        this.booking = booking;
        this.transport = transport;
        this.delegation = delegation;
    }
}
