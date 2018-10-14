/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateClass;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class TestDate {
    public static void main(String [] args){

Date date1 = new Date(01,11,1991);
Date date2;   

Scanner in = new Scanner(System.in);
System.out.println("Enter month: ");
String month = in.next();
System.out.println("Enter day: ");
int day = in.nextInt();
System.out.println("Enter year: ");
int year = in.nextInt();

date2 = new Date(month,day,year);

StringBuffer buffer = new StringBuffer("");
buffer.append("\nDate in salsh format: "+date1.slash()+"\n");
buffer.append("Date in month name format: " +date1.monthNameDate()+ "\n");
buffer.append("Date in day date format: " + date1.dateDay()+"\n");
System.out.println(buffer);
buffer = new StringBuffer("");
buffer.append("\nDate2 in salsh format: "+date2.slash()+"\n");
buffer.append("Date2 in month name format: " +date2.monthNameDate()+ "\n");
buffer.append("Date2 in day date format: " + date2.dateDay()+"\n");
System.out.println(buffer);

}
    
}
