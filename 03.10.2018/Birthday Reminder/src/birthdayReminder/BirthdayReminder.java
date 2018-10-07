/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birthdayReminder;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class BirthdayReminder {
    public static void main(String[] args) {
     String exit="ZZZ";
       final int size=10;
       int count=0;
       String name= null;
       String dateOfBirth= null;
       String[] names=new String[size];
       String[] birthdates= new String[size];
       Scanner in=new Scanner(System.in);
       System.out.println("Enter name or enter ZZZ to quit");
       name=in.nextLine();
       while(!name.equals(exit)&&count<10)
       {
           System.out.println("Enter date of birth (dd-mm-yyyy)");
           dateOfBirth=in.nextLine();
           names[count]=name;
           birthdates[count]=dateOfBirth;
           System.out.println("Enter name or enter ZZZ to quit");
           name=in.nextLine();
           count++;
       }
       System.out.println("Count of Names ="+count);
       System.out.println("Entered names = ");
               for (int i =0; i<names.length; i++) {
                   if (names[i] != null)
                   System.out.println((i+1) + ". " + names[i]);
               }
       for (int j =0;j<1000000; j++) {
           System.out.println("Enter the name of friend to find out birth date, or enter ZZZ to quit");
           String enteredName = in.nextLine();
                for (int y=0; y<names.length; y++){
                    if (enteredName.equals(names[y])){
                        System.out.println(names[y] + " has birthday on: " + birthdates[y]);
                        break;
                    }
                    else if ("ZZZ".equals(enteredName)) {
                        break;
                    }
                    else{
                        System.out.println("This name is not in you list");
                        break;
                    }
                }
           
       }        
               
               
    }
}
    
       
       
