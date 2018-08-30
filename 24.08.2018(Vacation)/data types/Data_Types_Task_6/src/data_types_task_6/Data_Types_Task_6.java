/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_types_task_6;
import java.util.Scanner;
/**
 * This program displays a story using words form input.
 * @author MihailT
 */
public class Data_Types_Task_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter noun");
        String firstNoun = in.nextLine();
        System.out.println("Enter another noun in multiple case");
        String secondNoun = in.nextLine();
        System.out.println("Enter and adjective");
        String adjective = in.nextLine();
        System.out.println("Enter a past tense verb");
        String verb = in.nextLine();
        System.out.println("On a full moon in the rain");
        System.out.println("The mighty " + firstNoun + " starts the chase");
        System.out.println("All the " + secondNoun + " start to prey");
        System.out.println("Their " + adjective + " lives will erase");
        System.out.println("Lucifer " + verb + " the souls which have gone in vain");    
           
    }
    
}
