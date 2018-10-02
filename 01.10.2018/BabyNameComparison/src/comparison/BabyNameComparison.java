/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparison;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class BabyNameComparison {
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            String firstName = null;
            String secondName = null;
            String thirdName = null;
            String[] babyNames = {firstName, secondName, thirdName};
            
            
        
        
        
        for (int i = 0; i < 3; i++) {
                System.out.println("Enter name");
                babyNames[i] = in.next();
                 
       }
        
       System.out.println(Arrays.toString(babyNames)); 
       
       for (int j = 0; j < 3; j++){
           System.out.println(babyNames[0] + " " + babyNames[j]);
           System.out.println(babyNames[1] + " " + babyNames[j]);
           System.out.println(babyNames[2] + " " + babyNames[j]);
       }
       
    }
    
}
