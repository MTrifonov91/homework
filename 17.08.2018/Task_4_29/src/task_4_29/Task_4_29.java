/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_4_29;

/**
 * This program writes the lyrics for "The 12 days of Christmas" song.
 * @author MihailT
 */
public class Task_4_29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int day =1; day<=12; day++){
            switch (day){
                case (1):
                    System.out.println("On the " + day + "st day of Christmas my true love" + "\n" + "sent to me");
                    break;
                case (2):
                    System.out.println("On the " + day + "nd day of Christmas my true love" + "\n" + "sent to me");
                    break;
                case (3):
                    System.out.println("On the " + day + "rd day of Christmas my true love" + "\n" + "sent to me");
                    break; 
                case (4):
                case (5):
                case (6):
                case (7):
                case (8):
                case (9):
                case (10):
                case (11):
                case (12):    
                    System.out.println("On the " + day + "th day of Christmas my true" + "\n" + "love sent to me");
                    break;  
                        }
            switch (day){
                case (12):
                    System.out.println("Twelve Drummers Drumming");
                case (11):
                    System.out.println("Eleven Pipers Piping");
                case (10):
                    System.out.println("Ten Lords a-Leaping");
                case (9):
                    System.out.println("Nine Ladies Dancing");
                case (8):
                    System.out.println("Eight Maids a-Milking");
                case (7):
                    System.out.println("Seven Swans a-Swimming");
                case (6):
                    System.out.println("Six Geese a-Laying");
                case (5):
                    System.out.println("Five Gold Rings");
                case (4):
                    System.out.println("Four Calling Birds");
                case (3):
                    System.out.println("Three French Hens");
                case (2):
                    System.out.println("Two Turtle Doves");
                default:
                    System.out.println("and a Paetridge in a Pear Tree");
                    break;
                case (1):
                    System.out.println("a Paetridge in a Pear Tree");
                    break;
            }
        }
        
    }
    
}
