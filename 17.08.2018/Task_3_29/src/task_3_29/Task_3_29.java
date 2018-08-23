/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_3_29;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Task_3_29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        // TODO code application logic here
        for (int k=0; k<=20; k++){
            if (k==20){
                System.out.println("Your time is over, contact system administrator");
            }
            else{ 
        System.out.println("Enter the size of the square (from 1 to 20)");
        int size = in.nextInt();
         if (size<1 || size>20){
                System.out.println("Enter the correct size");
            }
         else{
           for (int r=0; r<=size-1; r++) {
                if (r==0 || r==size-1) {
				for (int c=0; c<=size-1; c++) {
				System.out.print (" *");
					}
				System.out.println ("");
					}
			else {
				System.out.print (" *");
				for (int s=0; s<=size-3; s++) {
					System.out.print ("  ");
							}
				System.out.println (" *");
				}
			}
		}
	}
        }
    }
}
    
