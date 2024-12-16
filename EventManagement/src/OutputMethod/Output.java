/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OutputMethod;

import model.Event;

/**
 *
 * @author TUF
 */
public interface Output {

    public void addEvent();

    public void updateEvent();

    public void deleteEvent();

    public void searchEvent();

    public void displayEvent();

    public void searchbyID();

    public void searchbyName();

}
