/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_8;
import java.util.Scanner;
/**
 * This program tests scores.
 * @author MihailT
 */
public class Task_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // TODO code application logic here
        int score=0;
        int max_score=-1;
        int min_score=101;
        int scores_quantity=0;
        int scores_sum=0;
            while (score !=999){
                System.out.println("Enter the score or type 999 to exit");
                score = in.nextInt();
                if (score>=0 && score<=100){
                    scores_quantity++;
                    scores_sum += score; 
                    if (score<min_score){
                        min_score = score;
                    }
                    if (score>max_score){
                        max_score = score;
                    }
                }
                else {
                    System.out.println("Invalid score entered, try again");
                          
                }
            }
            System.out.println("Entered " + scores_quantity + " scores");
            System.out.println("Average score is = " + (scores_sum/scores_quantity));
            System.out.println("Highest score is " + max_score);
            System.out.println("Lowest score is " + min_score);
    }
    
}
