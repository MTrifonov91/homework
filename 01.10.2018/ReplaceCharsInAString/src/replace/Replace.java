/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package replace;

/**
 *
 * @author User
 */
public class Replace {
    
    public static String replaceMethod(char toBeReplaced, char replacer, String phrase) {
        char[] stringToCharArray = phrase.toCharArray();
        
        for (int i=0; i<stringToCharArray.length; i++) {
            if (stringToCharArray[i] == toBeReplaced){
                stringToCharArray[i] = replacer;
                }
        }
        String newPhrase = new String(stringToCharArray);
        
        return newPhrase;
    }
    
}
    
   
