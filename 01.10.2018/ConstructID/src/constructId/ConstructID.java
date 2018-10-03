/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructId;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class ConstructID {
    static String fullName;
    static String address;
    public static void main(String[] args) {
        getTheData();
    }
    
    public static void getTheData() {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter your full name");
        fullName = in.nextLine();
        System.out.println("Enter your address");
        address = in.nextLine();
        extractID();
        
    }
    
    public static void extractID() {
        String idFromName = fullName.replaceAll("[^A-Z]", "");
        String idFromAddress = address.replaceAll("\\D+", "");
        String theId = idFromName + idFromAddress;
        System.out.println(theId);
    }
    
}
