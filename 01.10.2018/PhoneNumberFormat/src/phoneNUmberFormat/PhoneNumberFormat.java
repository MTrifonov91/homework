/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phoneNUmberFormat;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class PhoneNumberFormat {
    static String telephoneNumber;
    public static void main(String[] args) {
        gettingNumber();
    }
    
    public static void gettingNumber() {
        Scanner in = new Scanner (System.in);
        for (int i = 0; i<999; i++) {
            System.out.println("Enter telephone number");
            telephoneNumber = in.nextLine();
            
                if (telephoneNumber.length() == 10) {
                    i=999;
                    formattingNumber();
                    
                }
                if ("999".equals(telephoneNumber)) {
                    i=999;
               
                }
        }
    }
    
    public static void formattingNumber() {
        telephoneNumber = "(" + telephoneNumber.substring(0,3) + ")" + 
                telephoneNumber.substring(3,6) + "-" + telephoneNumber.substring(6,10);
        System.out.println(telephoneNumber);
        
    }
    
    
    
}
