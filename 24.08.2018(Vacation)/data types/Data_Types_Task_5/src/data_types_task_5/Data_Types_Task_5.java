/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_types_task_5;
import java.util.Scanner;
/**
 * This program converts minutes to hours and days.
 * @author MihailT
 */
public class Data_Types_Task_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the ammount of minutes");
        int minute = in.nextInt();
        float hour = minute/60;
        float day = hour/24;
        System.out.print (minute + " minutes = ");
        System.out.printf("%.2f", hour);
        System.out.print(" hours, or ");
        System.out.printf("%.2f", day);
        System.out.println(" days");
      }
    
}
