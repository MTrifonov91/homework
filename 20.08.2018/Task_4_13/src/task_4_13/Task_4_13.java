/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_4_13;

/**
 * This program displays factorials 1 to 20
 * @author MihailT
 */
public class Task_4_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long factorial=1;
        System.out.print("Number");
        System.out.println("       Factorial of the number");
        for (int i=1; i<=20; i++){
            System.out.print(i);
            factorial *= i;
            System.out.println("               " + factorial);
            }
            
        }
    }
    
