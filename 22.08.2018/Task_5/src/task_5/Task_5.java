/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_5;
import java.util.Scanner;
/**
 * This program displays number between 2 entered numbers.
 * @author MihailT
 */
public class Task_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // TODO code application logic here
        int a,b;
        System.out.println("Enter your first number");
        a = in.nextInt();
        System.out.println("Enter your second number");   
        b = in.nextInt();
        if ( a==b || (a+b)==(a*2+1) || (a+b)==(a*2-1)){
            System.out.println("There are no Integer numbers between your numbers");
        }
        else if (a<b) {
            for (int i=a; i<b-1; i++){
                System.out.println(i+1);
               }
            }
        else {
            for (int i=a; i>b+1; i--){
                System.out.println(i-1);
        }
            
    }
    }    
}
