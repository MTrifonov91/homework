/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlineReservationSystem;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Ticket {
    static boolean running = true;

public static void main(String[] args) {      
    AirlineReservationsSystem tickets = new AirlineReservationsSystem();
    Scanner in = new Scanner(System.in);
    while(running){
        tickets.book();
        System.out.println("Type 'Quit' to quit, else any key to continue.");
        String quit = in.next();
        if (quit.equalsIgnoreCase("Quit"))
            running = false;
    }       
}
}
