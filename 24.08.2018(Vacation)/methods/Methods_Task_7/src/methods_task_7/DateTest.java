/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods_task_7;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class DateTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        Date display = new Date (0,0,0);
        int month;
        int day;
        int year;
        
        System.out.println("Enter Month");
        month = in.nextInt();
        display.setMonth(month);
        
        System.out.println("");
        
        System.out.println("Enter Day");
        day = in.nextInt();
        display.setDay(day);
        
        System.out.println("");
        System.out.println("Enter Year");
        year = in.nextInt();
        display.setYear(year);
        
        System.out.println("");
        
        
        display.displayDate();
        
    }
    
}
