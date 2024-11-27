/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
//import OutPutMethod.outputMethod;
//import InputCheckMethod.InputCheck;
//import OutPutMethod.outputMain;
import java.util.Scanner;

/**
 *
 * @author TUF
 */
public class Menu {

    Scanner sc = new Scanner(System.in);

//    public Menu() {
//        this.eventService = new outputMethod();
//    }

    public void run() {
        ArrayList<String> mainMenu = new ArrayList<>();
        mainMenu.add("Add new event");
        mainMenu.add("Check to exist by id");
        mainMenu.add("Search information by location");
        mainMenu.add("Update event by id");
        mainMenu.add("Delete event by id");
        mainMenu.add("Displaying a event list ");
        mainMenu.add("Exit");
        while (true) {
            System.out.println("=========== Menu ============");
            // Qua OutputMain thêm function
//            int choice = getIntChoice(mainMenu);
//            switch (choice) {
//                case 1:
//                    eventService.addEvent();
//                    break;
//                case 2:
//                    eventService.checkEventById();
//                    break;
//                case 3:
//                    hotelService.searchEventById();
//                    break;
//                case 4:
//                    hotelService.updateEvent();
//                    break;
//                case 5:
//                    hotelService.deleteevent();
//                    break;
//                case 6:
//                    hotelService.displayEvents();
//                    ;
//                    break;
//                case 7:
//                    System.out.println("Exit!");
//                    System.exit(0);
//                    break;
//            }
        }
    }

//    public int getIntChoice(ArrayList<String> list) {
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println((i + 1) + " - " + list.get(i));
//        }
//        System.out.println("=============================");
//        System.out.println("Please choose from 1 to 7 :");
////        int choose = InputCheck.readInteger("Your choose ", 1, 7);  // Qua InputCheck 
//
////        return choose;
//    }

    public static void main(String[] args) {
        Menu app = new Menu();
        app.run();
    }
}
