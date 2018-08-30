/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_types_task_4;
import java.util.Scanner;
/**
 * This progrm claculate conversion to banknotes of different 
 * @author MihailT
 */
public class Data_Types_Task_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the amount ");
        int ammount = in.nextInt();
        int banknotesOf20 = ammount / 20;
        int banknotesOf10 = (ammount%20) /10;
        int banknotesOf5 = (ammount%20%10) /5;
        int banknotesOf1 = (ammount%20%10%5) /1;
        System.out.println("For this ammount you will need: ");
        System.out.println(banknotesOf20 + " bank notes of 20$");
        System.out.println(banknotesOf10 + " bank notes of 10$");
        System.out.println(banknotesOf5 + " bank notes of 5$");
        System.out.println(banknotesOf1 + " bank notes of 1$");
     }
    
}
