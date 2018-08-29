/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_types_task_2;
import java.util.Scanner;
/**
 * This program counts egg price.
 * @author MihailT
 */
public class Data_Types_TasK_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        float dozenPrice = 3.25f;
        float loosePrice = 0.45f;
        System.out.println("Please enter the quantity of eggs you want to buy");
        int quantity = in.nextInt();
        int numberOfLoose = quantity %12; 
        int numberOfDozens = quantity /12;
        float totalDozen = numberOfDozens * dozenPrice;
        float totalLoose = numberOfLoose * loosePrice;
        float grandTotal = totalDozen + totalLoose;
        System.out.println("You ordered " + quantity + " eggs.");
        if (numberOfLoose==0){
            System.out.print("That's " + numberOfDozens + " dozen at " +dozenPrice + "$ per dozen");
        }
        else {
            System.out.print("That's " + numberOfDozens + " dozen at " +dozenPrice + "$ per dozen");
            System.out.print(" and " + numberOfLoose + " loose eggs at " +loosePrice + "$ for each");
        }
        System.out.println(" for a total of " + grandTotal + "$"); 
        
        
    }
    
}
