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
public class AirlineReservationsSystem {
    boolean[] firstClass = new boolean[5];
    boolean[] economyClass = new boolean[5];
    int numFirstClass = 0;
    int numEconomyClass = 0;
Scanner in = new Scanner(System.in);

public void book(){
    System.out.println("Press 1 for economy and 2 for first class.");
    int choice = in.nextInt();
    if (choice == 1)
        economyClass();
    else if (choice == 2)
        firstClass();
    else
        System.out.println("Invalid selection");                 
}

private void firstClass(){
    if (numFirstClass < 5){            
        for (int i = 0; i < firstClass.length; i++){                
            if(!firstClass[i]){
                firstClass[i] = true;
                System.out.println("First Class. Seat number: "+(i+1)); 
                numFirstClass++;
                break;
            }
        }
    }        
    else if (numEconomyClass < 5){
        System.out.println("No more 1st class. Press 1 if you would like to book an economy class ticket.");
        int choice = in.nextInt();            
        if (choice == 1)
           economyClass();
        else 
            System.out.println("The next flight leaves in 3 hours.");
    }        
    else
        System.out.println("All booked, the next flight leaves in 3 hours.");        
}

private void economyClass(){
    if (numEconomyClass < 5){            
        for (int i = 0; i < economyClass.length; i++){                
            if(!economyClass[i]){
                economyClass[i] = true;
                System.out.println("Economy Class. Seat number: "+(i+6)); 
                numEconomyClass++;
                break;
            }
        }
    }        
    else if (numFirstClass < 5){
        System.out.println("No more economy. Press 1 if you would like to book an first class ticket.");
        int choice = in.nextInt();            
        if (choice == 1)
           firstClass();
        else 
            System.out.println("The next flight leaves in 3 hours.");
    }        
    else
        System.out.println("All booked, the next flight leaves in 3 hours.");        
}    
}

