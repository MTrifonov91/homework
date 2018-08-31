/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flow_control_task_3;
import java.util.Scanner;
/**
 * This program promts user to choose the right paying plan for cellular phone service.
 * @author MihailT
 */
public class Flow_Control_Task_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount of minutes you need");
        int minutes = in.nextInt();
        System.out.println("Enter the amount of text messages you need");
        int sms = in.nextInt();
        System.out.println("Enter the ammount of data you need (gigabytes");
        float data = in.nextFloat();
        if (minutes<500 && sms==0 && data==0){
            System.out.println("The most suitable plan for you is Plan A, for 49$ per month");
        }
        if (minutes<500 && sms>0 && data==0){
            System.out.println("The most suitable plan for you is Plan B, for 55$ per month");
        }
        if (minutes>=500 && sms<100 && data==0){
            System.out.println("The most suitable plan for you is Plan C, for 61$ per month");
        }
        if (minutes>=500 && sms>=100 && data==0){
            System.out.println("The most suitable plan for you is Plan D, for 70$ per month");
        }
        if (data!=0 && data<2){
            System.out.println("The most suitable plan for you is Plan E, for 79$ per month");
        }
        if (data>2){
            System.out.println("The most suitable plan for you is Plan F, for 87$ per month");
        }
        
    }
    
}
