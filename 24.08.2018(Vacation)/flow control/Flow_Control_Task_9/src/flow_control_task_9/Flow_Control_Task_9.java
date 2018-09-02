/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flow_control_task_9;
import java.util.Scanner;
/**
 * This program is game of count to 21.
 * @author MihailT
 */
public class Flow_Control_Task_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        int humanChoice;
        int machineChoice =1;
        int total=machineChoice;
        System.out.println("Computer says - " + machineChoice);
        for (int round=1 ;total < 22; round++ ){
            System.out.println("Enter your value from 1 to 3");
            humanChoice = in.nextInt();
            if (humanChoice==1 || humanChoice==2 || humanChoice==3){
                total += humanChoice;
                System.out.println("Total = " + total);
                if (total>21){
                    System.out.println("You lost!");
                }
                if (total<21){
                machineChoice = 4 - humanChoice;
                System.out.println("Computer says - " + machineChoice);
                total +=machineChoice;
                System.out.println("Total = " + total);    
                }
           }
            else{
                
            }
        }
        
    }
    
}
