/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author TUF
 */
public class Event {
    private String name;
    private String date;
    private String location;
    private int number_attendees;
    private String status;

    public Event() {
    }

    public Event(String name, String date, String location, int number_attendees, String status) {
        this.name = name;
        this.date = date;
        this.location = location;
        this.number_attendees = number_attendees;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumber_attendees() {
        return number_attendees;
    }

    public void setNumber_attendees(int number_attendees) {
        this.number_attendees = number_attendees;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Event{" + "name=" + name + ", date=" + date + ", location=" + location + ", number_attendees=" + number_attendees + ", status=" + status + '}';
    }
    
}
