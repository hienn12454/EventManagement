/*      
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import dao.EventDAO;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import model.Event;

 /*
 * @author TUF
 */
public class Controller {
    private EventDAO EventDAO;
    private File file;
    private int nextID=1;
    

    
    public Controller() {
        this.EventDAO = new EventDAO();
        file = new File("src/resource/Event.dat");
    }
        public ArrayList<Event> getAllEvents() {

        Comparator<Event> eventNameComparator = new Comparator<Event>() {
            @Override
            public int compare(Event o1, Event o2) {
                return -o1.getName().compareTo(o2.getName());
            }
        };
        ArrayList<Event> events = EventDAO.getAllEvents(file);
        Collections.sort(events, eventNameComparator);
        return events;
    }
        
       public boolean addHotel(Event event) {
        return EventDAO.insertEvent(event, file);
    }
       public Event getEventById(String id) {
        return EventDAO.getEvent(id, file);
    }

    
    public ArrayList<Event> getEventByName(String name) {
         Comparator nameComparator=Comparator.comparing(Event::getName);
         ArrayList<Event> events=EventDAO.getEventByName(name, file);
         Collections.sort(events,nameComparator);
         return events;
    }

   
    public boolean updateHotel(Event event) {
        return EventDAO.updateEvent(event, file);
    }

    
    public boolean deleteHotel(String id) {
        return EventDAO.deleteEvent(id, file);
    }

    
    public int getSize() {
        return EventDAO.getAllEvents(file).size();
    }
    
    public String uniqueID(){
        return "Event "+ (nextID++);
    }
}
