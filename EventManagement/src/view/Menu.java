
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author TUF
 */
public class Menu { 
    Scanner sc = new Scanner(System.in);
    public void ListChoice(){
    List<String> list = new ArrayList<String>();
    list.add("Add event by id");
    list.add("Check event by id");
    list.add("Search information by id");
    list.add("Update event by id");
    list.add("Delete event by id");
    list.add("Displaying list event");
    list.add("exit");
    while(true){
        System.out.println("Menu");
        int choice = sc.nextInt();
        switch(choice){
            case 1: 
                
                break;
            case 2:
                
                
                break;
            case 3:
                
                
                break;
            case 4:
                
                
                break;
            case 5:
                
                
                break;
            case 6:
                
                
                break;
        }
    }
}
 public static void main(String[] args) {
     Menu mainMenu = new Menu();
     mainMenu.ListChoice();
}
}
