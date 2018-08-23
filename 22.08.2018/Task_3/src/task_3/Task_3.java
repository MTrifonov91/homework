/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_3;
import java.util.Scanner;
/**
 * This program selects even numbers entered by user.
 * @author MihailT
 */
public class Task_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int number=0;
                    while (number != 999){
                System.out.println("Enter an even number, or enter 999 to exit");
            number = in.nextInt();
                if (number%2==0){
                    System.out.println("Good job! enter another number");
                }
                else 
                    System.out.println("That is not en even number, try again");
                    
                }
            }
            
            }
        
        // TODO code application logic here
    
    
