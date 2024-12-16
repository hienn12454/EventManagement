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
    private String id;
    private String date;
    private String location;
    private int attendees;
    private String status;




    public Event(String name, String id, String date, String location, int attendees, String status) {
        this.name = name;
        this.id = id;
        this.date = date;
        this.location = location;
        this.attendees = attendees;
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

    public int getAttendees() {
        return attendees;
    }

    public void setAttendees(int attendees) {
        this.attendees = attendees;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

     public static Event fromString(String line) {
        String[] fields = line.split("-");
        return new Event(fields[0], fields[1], fields[2], (fields[3]), Integer.parseInt(fields[4]), fields[5]);
    }

    @Override
    public String toString() {
        return name + "-" + id + "-" + date + "-" + location + "-" + attendees + "-" + status;
    }
    
    


}
