/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flow_control_task_5;
import java.util.Scanner;
import java.lang.Math;

/**
 * This program is a game of Rock, Scissors and Paper.
 * @MihailT
 */
public class Flow_Control_Task_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int min = 1;
        int max = 3;
        int range = (max - min) + 1;
        for (int i = 0; i < 999; i++){
            System.out.println("Enter the folowong values for you choice:");
            System.out.println("1 - scissors \n2 - rock \n3 - paper \n4 - exit");
            int humanChoice = in.nextInt();
            int machineChoice = (int)(Math.random()*range) + min;
            switch (humanChoice){
                case (4):
                    i = 999;
                    break;
                case (1):
                    System.out.print("Scissors -");
                    switch (machineChoice){
                        case (1):
                            System.out.println(" Scissors");
                            System.out.println("Tie");
                            break;
                        case (2):
                            System.out.println(" Rock");
                            System.out.println("You lost");
                            break;
                        case (3):
                            System.out.println(" Paper");
                            System.out.println("You won");
                            break;
                    }
                    break;
                case (2):
                    System.out.print("Rock -");
                    switch (machineChoice){
                        case (1):
                            System.out.println(" Scissors");
                            System.out.println("You won");
                            break;
                        case (2):
                            System.out.println(" Rock");
                            System.out.println("Tie");
                            break;
                        case (3):
                            System.out.println(" Paper");
                            System.out.println("You lost");
                            break;
                    }
                    break;
                case (3):
                    System.out.print("Paper -");
                    switch (machineChoice){
                        case (1):
                            System.out.println(" Scissors");
                            System.out.println("You lost");
                            break;
                        case (2):
                            System.out.println(" Rock");
                            System.out.println("You won");
                            break;
                        case (3):
                            System.out.println(" Paper");
                            System.out.println("Tie");
                            break;
                    }
                    break;
                    
            }
            
        }
    }
    
}
