/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flow_control_task_2;
import java.util.Scanner;
/**
 * This program arranges 3 entered integers from in ascending and descending order
 * @author MihailT
 */
public class Flow_Control_Task_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int min = 2147000000;
        int max = -2147000000;
        int medium = 0;
        int a=0;
        int b=0;
        int c=0;
        for (int i=0; i<3; i++){
          System.out.println("Enter a number");
          int number = in.nextInt();
          switch (i){
              case (0):
                  a = number;
                  break;
              case (1):
                  b = number;
                  break;
              case (2):
                  c = number;
                  break;
          }
          
        }
        if (a < min){
              min = a;
          }
        if (a > max){
              max = a;
          }
        if (b < min){
              min = b;
          }
        if (b > max){
              max = b;
          }
        if (c < min){
              min = c;
          }
        if (c > max){
              max = c;
          }
        if (a>min&&a<max){
            medium = a;
        } 
        if (b>min&&b<max){
            medium = b;
        } 
        if (c>min&&c<max){
            medium = c;
        } 
        System.out.println("Ascending order: " + min + ", " + medium + ", " + max);
        System.out.println("Descending order: " + max + ", " + medium + ", " + min);
        
    }
    
}
