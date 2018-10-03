/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Palindrome {
    static String thePhrase;
    
    public static void main(String[] args) {
        getPhrase();
    }
    
    public static void getPhrase() {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter your phrase");
        thePhrase = in.nextLine();
        removeSpaces();
        
    }
    public static void removeSpaces() {
        thePhrase = thePhrase.replaceAll(" ", "");
        removeUperCases();
    }
    
    public static void removeUperCases() {
        thePhrase = thePhrase.toLowerCase();
        removePunctuation();
    }
    
    public static void removePunctuation() {
        thePhrase = thePhrase.replaceAll("[,.'!?]", "");
        reversePhrase();
    }
    
    public static void reversePhrase() {
        StringBuilder reversedPhrase = new StringBuilder();
        reversedPhrase.append(thePhrase);
        reversedPhrase = reversedPhrase.reverse();
        System.out.println(thePhrase);
        System.out.println(reversedPhrase);
        if (thePhrase.equals(reversedPhrase.toString())) {
            System.out.println("The phrase is a Palindrome");
        }
        else {
            System.out.println("The phrase is NOT a Palindrome");
        }
        
        
    }
    
    
    
}
