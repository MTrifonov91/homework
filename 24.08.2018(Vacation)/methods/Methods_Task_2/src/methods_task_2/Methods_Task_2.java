/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods_task_2;
import java.util.Scanner;
/**
 *
 * @author MihailT
 */
public class Methods_Task_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        System.out.println("Enter your name");
        String name = in.nextLine();
        System.out.println("Enter your average grade");
        double average = in.nextDouble();
                
        displayMessage(name, (double) average);
                
    }
    public static void displayMessage (String name,double average){
        System.out.println("Congratulations " + name + "! for your"
                + " average of " + average + " you received a"
                + " bookstore credit of " + (average*10) + "$");  
    }
    
}
