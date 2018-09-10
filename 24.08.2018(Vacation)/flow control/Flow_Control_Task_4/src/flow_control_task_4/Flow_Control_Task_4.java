/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flow_control_task_4;
import java.util.Scanner;
import java.lang.Math;
/**
 * This program is a lottery game, try you luck.
 * MihailT
 */
public class Flow_Control_Task_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        int max = 9;
        int min = 0;
        int range = max - min + 1;
        int rand1=0;
        int rand2=0;
        int rand3=0;
        int guess1=0;
        int guess2=0;
        int guess3=0;
        for (int i = 0; i < 3; i++){
            switch (i){
                case (0):
                    rand1 = 1;//(int)(Math.random()*range) + min;
                    break;
                case (1):
                    rand2 = 1;//(int)(Math.random()*range) + min;
                    break;
                case (2):
                    rand3 = 1;//(int)(Math.random()*range) + min;
                    break;
            }
        }
        for (int j = 0; j < 3; j++){
            System.out.println("Enter a number");
            switch (j){
                case (0):
                    guess1 = in.nextInt();
                    break;
                case (1):
                    guess2 = in.nextInt();
                    break;
                case (2):
                    guess3 = in.nextInt();
                    break;
            }
        }
        if (guess1==rand1 && guess2==rand2 && guess3==rand3){
            System.out.println("Congratulations you have won 1,000,000$");
        }
        else if ((guess1==rand1 || guess1==rand2 || guess1==rand3) && 
                (guess2==rand1 || guess2==rand2 || guess2==rand3) &&
                    (guess3==rand1 || guess3==rand2 || guess3==rand3)){
            System.out.println("Congratulations you have won 1,000$");
        }
        else if ((guess2==rand1 || guess2==rand2 || guess2==rand3) &&
                guess1!=rand1 && guess1!=rand2 && guess1!=rand3 &&
                    guess3!=rand1 && guess3!=rand2 && guess3!=rand3){
            System.out.println("Congratulations you have won 10$");
        }
        else if ((guess1==rand1 || guess1==rand2 || guess1==rand3) &&
                guess2!=rand1 && guess2!=rand2 && guess2!=rand3 &&
                    guess3!=rand1 && guess3!=rand2 && guess3!=rand3){
            System.out.println("Congratulations you have won 10$");
        }
        else if ((guess3==rand1 || guess3==rand2 || guess3==rand3) &&
                guess2!=rand1 && guess2!=rand2 && guess2!=rand3 &&
                    guess1!=rand1 && guess1!=rand2 && guess1!=rand3){
            System.out.println("Congratulations you have won 10$");
        }
        else if (guess1!=rand1 && guess1!=rand2 && guess1!=rand3 && 
                guess2!=rand1 && guess2!=rand2 && guess2!=rand3 &&
                    guess3!=rand1 && guess3!=rand2 && guess3!=rand3){
            System.out.println("No mateches!");
        }
        else {
            System.out.println("Congratulations you have won 100$");
        }
        
        System.out.println ("Generated digits: " + rand1 + " " + rand2 + " " + rand3);
        System.out.println("Guess: " + guess1 + " " + guess2 + " " + guess3);
    }
    
}
