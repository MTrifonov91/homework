/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flow_control_task_8;
import java.util.Scanner;
/**
 *  This program shows sores in a chart.
 * @author MihailT
 */
public class Flow_Control_Task_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        
        System.out.print("Enter points scored by Art >> ");
        int pointsArt = in.nextInt();
        System.out.print("Enter points scored by Bob >> ");
        int pointsBob = in.nextInt();
        System.out.print("Enter points scored by Cal >> ");
        int pointsCal = in.nextInt();
        System.out.print("Enter points scored by Dan >> ");
        int pointsDan = in.nextInt();
        System.out.print("Enter points scored by Eli >> ");
        int pointsEli = in.nextInt();
        System.out.println("\nPoints for Game");
        
        System.out.print("\nArt\t");
        for (int i=0; i<pointsArt; i++){
            System.out.print("*");
        }
        System.out.print("\nBob\t");
        for (int i=0; i<pointsBob; i++){
            System.out.print("*");
        }
        System.out.print("\nCal\t");
        for (int i=0; i<pointsCal; i++){
            System.out.print("*");
        }
        System.out.print("\nDan\t");
        for (int i=0; i<pointsDan; i++){
            System.out.print("*");
        }
        System.out.print("\nEli\t");
        for (int i=0; i<pointsEli; i++){
            System.out.print("*");
        }
        System.out.println("\n");
    }
    
}
