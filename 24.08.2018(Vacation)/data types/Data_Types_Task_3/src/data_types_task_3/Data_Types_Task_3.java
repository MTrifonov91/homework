/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_types_task_3;
import java.util.Scanner;
/**
 * This program counts meals.
 * @author MihailT
 */
public class Data_Types_Task_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        int adultMealPrice = 7;
        int kidsMealPrice = 4;
        System.out.println("How many adult meals were sold?");
        int adultMealQuantity = in.nextInt();
        System.out.println("How many child's meals were sold?");
        int kidsMealQuantity = in.nextInt();
        System.out.println("Ammount collected for adult meals = " + (adultMealPrice*adultMealQuantity) + "$");
        System.out.println("Ammount collected for child's meals = " + (kidsMealPrice*kidsMealQuantity) + "$");
        System.out.print("Total ammount colected = ");
        System.out.println(((adultMealPrice*adultMealQuantity)+(kidsMealPrice*kidsMealQuantity)) + "$");
        
    }
    
}
