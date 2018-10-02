/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validatePass;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ValidatePassword {
    
    public static void main(String[] args) {
        
        passwordReview();
          
    }
    
    public static void passwordReview() {
        Scanner in = new Scanner (System.in);
        String password;
        for (int passValidateCount = 0; passValidateCount<1000; passValidateCount++) {
            System.out.println("Enter passord");
            password = in.nextLine();
            char[] stringToCharArray = password.toCharArray();
        int lowerCaseCounter = 0;
        int upperCaseCounter = 0;
        int digitCounter = 0;
        
        
            for (int i = 0; i<stringToCharArray.length; i++) {
                
                if (Character.isDigit(stringToCharArray[i])) {
                    digitCounter++;
                }
                
                if (Character.isLowerCase(stringToCharArray[i])) {
                    lowerCaseCounter++;
                }
                
                if (Character.isUpperCase(stringToCharArray[i])) {
                    upperCaseCounter++;
                }
                
            }
            
            if (lowerCaseCounter>=2 && upperCaseCounter>=2 && digitCounter>=2) {
                System.out.println("Your Password is Valid");
                passValidateCount = 1000;
            }
            if (lowerCaseCounter<2) {
                System.out.println("Your password has not enough lower case letters");
                
            }
            if (upperCaseCounter<2) {
                System.out.println("Your password has not enough upper case letters");
                
            }
            if (digitCounter<2) {
                System.out.println("Your password has not enough digits");
                
            }
            
        }
        
    }
    
    
}
