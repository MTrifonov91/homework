/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pigLatin;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class PigLatin {
    static Scanner in = new Scanner (System.in);
    static String word = in.nextLine();
    static int vowelStart=0;
        
    public static void testWord() {
        String vowels = "aAeEuUiIoO";
        char[] vowelsArray = vowels.toCharArray();
        
        for (int i = 0; i<vowelsArray.length; i++) {
            if (vowelsArray[i] == word.charAt(0)) {
                startsWithVowel();
                i = 100000000;
            }
            else  {
                startsWithConsonant();
                i = 100000000;
                
            }
            
        }
               
    }
    
    public static void startsWithVowel() {
        word += "ay";
        System.out.println(word);
    }
    
    public static void startsWithConsonant() {
        char[] wordArray = word.toCharArray();
        if (wordArray[0] == 'y' || wordArray[0] == 'Y'){
                vowelStart=1;
               
            }
        else {
            for (int i = 0; i<wordArray.length; i++) {
            
            if (wordArray[i] == 'a' || wordArray[i] == 'A' || wordArray[i] == 'e'
                    || wordArray[i] == 'E' || wordArray[i] == 'u' || wordArray[i] == 'U'
                    || wordArray[i] == 'i' || wordArray[i] == 'I' || wordArray[i] == 'o'
                    || wordArray[i] == 'O' || wordArray[i] == 'y' || wordArray[i] == 'Y'){
                vowelStart=i;
                i=10000000;
            }
            
            
        }
        }
        
        word = word.substring(vowelStart) + word.substring(0,vowelStart) + "ay";
        System.out.println(word);
       
        
    }
    
   
    
    
        
       
        
    
    
    }
    
    

