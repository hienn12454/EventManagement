/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import model.Event;

/**
 *
 * @author TUF
 */
public class EventDAO {
    public boolean insertEvent(Event event, File file){
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(event.toString()+"\n");
            writer.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
                    
        }
        return false;
        
    }
    public Event getEvent(String id, File file){
        try {
            FileReader dile = new FileReader(file);
            BufferedReader reader = new BufferedReader(dile);
            String line;
            while((line=reader.readLine()) != null){
                if(line.trim().equals("")){
                    break;
                }
                Event event = Event.fromString(line);
                if(event.getId().equals(id)){
                    reader.close();
                    return event;
                }
            }
        } catch (Exception e) {
        }
        return null;
        }
    public boolean updateEvent(Event newEvent, File file){
        try {
            File tempFile = new File("src/temp.dat");
            FileReader dile = new FileReader(file);
            BufferedReader reader = new BufferedReader(dile);
            FileWriter writer = new FileWriter(tempFile);
            String line;
            while((line=reader.readLine()) != null){
                if(line.trim().equals("")){
                    break;
                }
                Event event = Event.fromString(line);
                if(event.getId().equals(newEvent.getId())){
                    writer.write(newEvent.toString() + "\n");
                }else{
                    writer.write(line + "\n");
                }
            }
            reader.close();
            writer.close();
            
            file.delete();
            tempFile.renameTo(file);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean deleteEvent(String id, File file){
        try {
            File tempFile = new File("src/temp.dat");
            FileReader dile = new FileReader(file);
            BufferedReader reader = new BufferedReader(dile);
            FileWriter writer = new FileWriter(tempFile);
            String line;
            boolean deleted = false;
            while((line=reader.readLine()) != null){
                if(line.trim().equals("")){
                    break;
                }
                Event event = Event.fromString(line);
                if(event.getId().equals(id)){
                    deleted = true;
                    continue;
                }
                writer.write(line + "\n");
            }
            reader.close();
            writer.close();
            file.delete();
            tempFile.renameTo(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public ArrayList<Event>getEventByName(String name, File file){
    ArrayList<Event> events = new ArrayList<>();
            try {
                FileReader dile = new FileReader(file);
                BufferedReader reader = new BufferedReader(dile);
                String line;
                while((line=reader.readLine())!=null){
                    if(line.trim().equals("")){
                        break;
                    }
                    Event event = Event.fromString(line);
                    if(event.getName().contains(name)){
                        events.add(event);
                    }
                }
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        return events;
}
    public ArrayList<Event> getAllEvents(File file){
        ArrayList<Event> events = new ArrayList<>();
        try {
            FileReader diles = new FileReader(file);
            BufferedReader reader = new BufferedReader(diles);
            String line;
            while((line = reader.readLine())!=null){
                if(line.trim().equals("")){
                    break;
                }
                Event event = Event.fromString(line);
                events.add(event);
            }
            reader.close();
        } catch (Exception e) {
        }
        return events;
        
    }
    }

