/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morseEncodeDecode;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class MorseEncoder {
        static char[] english = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
        'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
        'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ' '} ;
    
        static String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
        "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", 
        ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", 
        "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", 
        "-----", " "};
    
    
    public static void encode()  {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the phrase you want to encode ");
        String phrase = in.nextLine();
        phrase = phrase.toLowerCase();
        String[] toStrigArray = {};
        char[] toCharArray = phrase.toCharArray();
            for (int i = 0; i<toCharArray.length; i++) {
                for (int j = 0; j<english.length; j++)
                if (english[j] == toCharArray[i]) {
                    System.out.print(morse[j] + " ");
                }
                  
            }
        
    }
    public static void decode()  {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your morse code  ");
        String code = in.nextLine();
        String[] codeToArray = code.split("\\s+");
        int codeCount = codeToArray.length;
        
        //System.out.println(Arrays.toString(codeArray));
            for (int i = 0; i<codeCount; i++) {
                for (int j = 0; j<morse.length; j++)
                if (morse[j].equals(codeToArray[i]) ) {
                    System.out.print(english[j] + " ");
                } 
                
            }
        
    }
    
}
