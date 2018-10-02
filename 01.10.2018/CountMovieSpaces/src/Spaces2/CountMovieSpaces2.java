/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spaces2;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class CountMovieSpaces2 {
    
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter your favourite movie quote");
         System.out.print("Your favourite movie quote contains " + movieQuote(in.nextLine()) + " spaces.");
         
    }
    
    public static int movieQuote(String quoteToCountSpaces) {
        char[] stringToCharArray = quoteToCountSpaces.toCharArray();
        int counter = 0;
            for (int i=0; i<stringToCharArray.length; i++) {
                if (stringToCharArray[i] == ' ') {
                    counter++;
                    
                }
            }
           
        return counter;
    }
    
    
}
