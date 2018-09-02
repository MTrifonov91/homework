/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author User
 */
public class ShowStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Student Bob = new Student();
        System.out.println("Enter Bob's ID");
        Bob.setidNUmber(in.nextInt());
        System.out.println("Enter number of Bob's credit hours ");
        Bob.setcreditHours(in.nextInt());
        System.out.println("Enter Bob's points");
        Bob.setpoints(in.nextInt());
        Bob.setgradePointAverage(Bob.getgradePointAverage());
        
        System.out.println("Student's name = " + Bob);
        System.out.println("Student's ID = " + Bob.getidNUmber());
        System.out.println("Student's number of hours = " + Bob.getcreditHours());
        System.out.println("Student's amount of points = " + Bob.getpoints());
        System.out.println("Student's grade point average = " + Bob.getgradePointAverage());
    }
    
}
