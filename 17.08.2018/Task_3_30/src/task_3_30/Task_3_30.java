/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_3_30;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Task_3_30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // TODO code application logic here
        for (int k = 0; k <= 20; k++) {
            if (k == 20) {
                System.out.println("Your time is over, contact system administrator");
            } else {
                System.out.println("Enter a 5 digit number");
                String palindromString = in.next();
               int posiblePalindromNumber = new Integer(palindromString);
               int reversedNumber = 0;
               int[] digits = new int[palindromString.length()];
               for (int i= posiblePalindromNumber; posiblePalindromNumber>0; posiblePalindromNumber/=10){
                   int digit = posiblePalindromNumber % 10;
                   reversedNumber = reversedNumber * 10 + digit;
               }
                   posiblePalindromNumber = new Integer(palindromString);
               if (posiblePalindromNumber == reversedNumber){
                    System.out.println(reversedNumber + " Is a palindrom");
                }
                else{
                    System.out.println(posiblePalindromNumber + " Is not a palindrom");
                }
            }
           
        }
    }
}
