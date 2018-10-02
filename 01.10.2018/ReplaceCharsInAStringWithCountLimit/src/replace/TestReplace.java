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
public class TestReplace {
    public static void main(String[] args) {
        System.out.println(replaceCharTimes("I am a complete noob at this and that", 'a', 'A', 1));
        System.out.println(replaceCharTimes("I am a complete noob at this and that", 'a', 'A', 2));
        System.out.println(replaceCharTimes("I am a complete noob at this and that", 'a', 'A', 3));
        System.out.println(replaceCharTimes("I am a complete noob at this and that", 'a', 'A', 4));
        System.out.println(replaceCharTimes("I am a complete noob at this and that", 'a', 'A', 5));
    }
    
    public static String replaceCharTimes(String stringToBeModified,
            char toBeReplaced, char replace, int counter) {
                
        char[] stringToCharArray = stringToBeModified.toCharArray();
        int count = 0;
        
            for (int j = 0; j<stringToCharArray.length; j++) {
                
                if (count<counter){
                    if (stringToCharArray[j] == toBeReplaced) {
                    stringToCharArray[j] = replace;
                    count++;                                      
                }
                }
                
            }
        
            
            
        
            
        String newPhrase = new String(stringToCharArray);
        return newPhrase;
    }
    
}
