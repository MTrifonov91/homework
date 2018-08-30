/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flow_control_task_1;
import java.util.Scanner;
/**
 * This programe determines even/odd numbers.
 * @author MihailT
 */
public class Flow_Control_Task_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        for (int i = 0; i<=999; i++){
            System.out.println("Enter a whole number. or type 999 to exit");
            int number = in.nextInt();
            if (number%2==0){
                System.out.println(number + " is a even number");
            }
            else if (number == 999){
                i=number;
                }
            else{ 
                System.out.println(number + " is a odd number");
            }
        }
    }
    
}
