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
public class ReplaceIndex {
    
    public static String replaceCharFromIndex(String stringToBeModified, char toBeReplaced,
            char replace, int index) {
        
        char[] stringToCharArray = stringToBeModified.toCharArray();
        
            for (int i = 0; i<stringToCharArray.length; i++) {
                if (i>index) {
                 if (stringToCharArray[i] == toBeReplaced) {
                    stringToCharArray[i] = replace;
                }   
                }
                
            }
        String newPhrase = new String(stringToCharArray);
        return newPhrase;
    }
    
}
