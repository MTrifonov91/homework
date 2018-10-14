/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicateElimination;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class DuplicateElimination {
    
    
    public static void getNumbers() {
	Scanner input = new Scanner(System.in);
	int[] array = new int[5];
        int entered = 0; // number of entered numbers
             while (entered < array.length) {
	            System.out.println("Enter number: ");
	            int num = input.nextInt();
                        if ((num < 10) || (num > 100)) {
	                System.out.println("Number " + num + " is invalid should be betwwen 10 and 100");
	                //continue;
                        }
                        else {
                        int i;
                     for(i = 0; i < entered; ++i) {
	                if(num == array[i]) {
	                    System.out.println("Number is a duplicate");
	                    break;
                        }
                       
	            
	    } // end while
             System.out.println(array);
	} 
             }
    }// end method getNumbers
    
    public static void main(String[] args) {
        getNumbers();
    }
}

