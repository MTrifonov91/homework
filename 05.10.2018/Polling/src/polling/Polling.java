/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polling;

/**
 *
 * @author User
 */
public class Polling {
    
    public static String[] topics = {"Social issues", "Military issues", 
        "Environmentlal issues", "Economical issies", "Foreign policy issues"};
    
    static int[][] responses = new int[5][10]; 
    
    
    public static void thePoll() {
        for (int i = 0; i<responses.length; i++) {
            for (int j = 0; j<responses.length; j++) {
                System.out.println("Please mark with scores of 0 to 10 the folowing"
                        + " issues, judjung by their importance to you");
                for (int y = 0; y<topics.length; y++) {
                    System.out.println(topics[y]);
                }
            }
        }
        
    }
    
    
    
    
}
