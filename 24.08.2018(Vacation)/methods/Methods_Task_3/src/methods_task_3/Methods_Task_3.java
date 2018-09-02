/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods_task_3;
import java.util.Scanner;
/**
 *  This progra is a converter (imperial ot metric and reverse).
 * @author MihailT
 */
public class Methods_Task_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        System.out.println("Enter value");
        int value = in.nextInt();
        displayCentimeters (value);
        displayLitres (value);
    }
    public static void displayCentimeters (int value){
        System.out.println(value + " inch/es = " + (value*2.54) + " centimeters");
    }
    public static void displayLitres (int value){
        System.out.println(value + " gallon/s = " + (value*2.7854) + " litres");
    }
    
    
}
