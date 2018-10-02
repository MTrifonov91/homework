/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spaces;

/**
 *
 * @author User
 */
public class CountMovieSpaces {
    
    public static void main(String[] args) {
        
        System.out.println(movieQuote("I fucking hate pikeys"));
        
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
