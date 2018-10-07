/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metricConversions;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class MetricConversion {
    static String[] metricLength = {"milimeters", "centimeters", "decimeters", "meters", "kilometers"};
    static String[] imperialLength = {"inches", "feets", "yards", "miles"};
    static String[] metricVolume = {"litres", "cubic meters"};
    static String[] imperialVolume = {"quarts", "gallons"};
    static String[] metricWeight = {"grams", "kilograms", "tones"};
    static String[] imperialWeight = {"ounces", "pounds"};
    
    public static void inputGetter() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your question in the folowing format: "
                + " How many meters are in (quantity) mile");
        String userInput = in.nextLine();
        String[] userInputToArray = userInput.split("\\s+");
            for (int i = 0; i < 7; i++) {
                if ("How".equals(userInputToArray[0]) && "many".equals(userInputToArray[1]) &&
                        "are".equals(userInputToArray[3]) && "in".equals(userInputToArray[4]) ){
                    if (metricLength.equals(userInputToArray[2]) && imperialLength.equals(userInputToArray[5]) ||
                        imperialLength.equals(userInputToArray[2]) && metricLength.equals(userInputToArray[5]) ||
                        metricVolume.equals(userInputToArray[2]) && imperialVolume.equals(userInputToArray[5]) ||
                        imperialVolume.equals(userInputToArray[2]) && metricVolume.equals(userInputToArray[5]) ||
                        metricWeight.equals(userInputToArray[2]) && imperialWeight.equals(userInputToArray[5]) ||
                        imperialWeight.equals(userInputToArray[2]) && metricWeight.equals(userInputToArray[5])) {
                        
                        System.out.println("Your data is correct");
                        
                    }
                    else{
                        System.out.println("You have entered incomparable types");
                    }
                        
                                    
                }
                else{
                    System.out.println("You have entered your question in wrong format");
                }
            }
        
    }
    
    
    
}
