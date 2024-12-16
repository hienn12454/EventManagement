
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controller.Controller;
import InputCheck.InputCheck;
import OutputMethod.Output;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import model.Event;

/**
 *
 * @author TUF
 */
public class Menu {


   
    private final Scanner sc = new Scanner(System.in);
    private final Controller controller = new Controller();
    private final InputCheck inputCheck = new InputCheck();
    public void ListChoice() {
        List<String> list = new ArrayList<String>();
        list.add("1. Add event ");
        list.add("2. Check event by id");
        list.add("3. Search information by name");
        list.add("4. Update event by id");
        list.add("5. Delete event by id");
        list.add("6. Displaying list event");
        list.add("7. exit");

        while (true) {
            System.out.println("==================Menu====================");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
            System.out.println("==========================================");
            System.out.println("Please choose the option ");
            int choice = inputCheck();

            switch (choice) {
                case 1:
                    addEvent();
                    break;
                case 2:
                    searchById();
                    break;
                case 3:
                    searchByName();
                    break;
                case 4:
                    updateEvent();
                    break;
                case 5:
                    deleteEvent();
                    break;
                case 6:
                    displayAllEvents();
                    break;
                case 7:
                    System.out.println("Exiting the menu. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addEvent() {
        String name = inputCheck.checkName();
        String id = inputCheck.uniqueId(); 
        String date = inputCheck.checkDate();
        String location = inputCheck.checkLocation();
        int attendees = Integer.parseInt(inputCheck.checkAttendes1());
        String status = inputCheck.checkStatus();

        Event event = new Event(name, id, date, location, attendees, status);
        boolean isAdded = controller.addHotel(event);

        if (isAdded) {
            System.out.println("Event added successfully!");
        } else {
            System.out.println("Failed to add event.");
        }
    }

    private void searchById() {
        System.out.println("Enter event ID to search:");
        String id = sc.next();

        Event event = controller.getEventById(id);
        if (event != null) {
            System.out.println("Event found: " + event);
        } else {
            System.out.println("No event found with ID: " + id);
        }
    }

    private void searchByName() {
        System.out.println("Enter event name to search:");
        String name = sc.next();

        ArrayList<Event> events = controller.getEventByName(name);
        if (events.isEmpty()) {
            System.out.println("No events found with the name: " + name);
        } else {
            System.out.println("Events found:");
            for (Event event : events) {
                System.out.println(event);
            }
        }
    }

    private void updateEvent() {
        System.out.println("Enter event ID to update:");
        String id = sc.next();

        Event existingEvent = controller.getEventById(id);
        if (existingEvent != null) {
            System.out.println("Existing event: " + existingEvent);
            System.out.println("Enter new event details:");

            String name = inputCheck.checkName();
            String date = inputCheck.checkDate();
            String location = inputCheck.checkLocation();
            int attendees = Integer.parseInt(inputCheck.checkAttendes1());
            String status = inputCheck.checkStatus();

            Event updatedEvent = new Event(name, id, date, location, attendees, status);
            boolean isUpdated = controller.updateHotel(updatedEvent);

            if (isUpdated) {
                System.out.println("Event updated successfully!");
            } else {
                System.out.println("Failed to update event.");
            }
        } else {
            System.out.println("No event found with ID: " + id);
        }
    }

    private void deleteEvent() {
        System.out.println("Enter event ID to delete:");
        String id = sc.next();

        boolean isDeleted = controller.deleteHotel(id);
        if (isDeleted) {
            System.out.println("Event deleted successfully!");
        } else {
            System.out.println("Failed to delete event or event not found.");
        }
    }

    private void displayAllEvents() {
        ArrayList<Event> events = controller.getAllEvents();
        if (events.isEmpty()) {
            System.out.println("No events to display.");
        } else {
            System.out.println("All events:");
            for (Event event : events) {
                System.out.println(event);
            }
        }
    }
    public int inputCheck() {
        int choice = 0;
        boolean key = true;
        do {

            try {
                System.out.println("Enter your choice !");
                choice = sc.nextInt();

                key = false;
            } catch (Exception e) {
                System.out.println("Only enter number !");
                sc.nextLine();
            }
        } while (key);
        return choice;
    }

    public static void main(String[] args) {
        Menu mainMenu = new Menu();
        mainMenu.ListChoice();
    }
}







