/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meanMediean;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class MeanMedian {
    Scanner in = new Scanner(System.in);
    private int[] numbers = new int[5];
    private int number;
    
    
    public MeanMedian() {
    }
    
    public void getTheNUmbersFromTheUser() {
        for (int i = 0; i<5; i++) {
            switch (i){
                case 0: System.out.println("Enter " + (i+1) + "st number");
                number = in.nextInt();
                numbers[i] = number;
                   break;
                case 1: System.out.println("Enter " + (i+1) + "nd number");
                number = in.nextInt();
                numbers[i] = number;
                    break;
                case 2: System.out.println("Enter " + (i+1) + "rd number");
                number = in.nextInt();
                numbers[i] = number;
                    break;    
                case 3: System.out.println("Enter " + (i+1) + "th number");
                number = in.nextInt();
                numbers[i] = number;
                    break; 
                case 4: System.out.println("Enter " + (i+1) + "th number");
                number = in.nextInt();
                numbers[i] = number;
                    break;    
            }
        }
        sortTheArray();
        getTheMean();
        getTheMedian();
    }
    
    public void sortTheArray() {
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    
    public void getTheMean() {
        int summ = 0;
        for (int i = 0; i<numbers.length; i++) {
            summ += numbers[i];
        }
        int mean = summ / numbers.length;
        System.out.println("The mean of this list is: " + mean);
    } 
    
    public void getTheMedian() {
        int median = numbers[2];
        System.out.println("The median of this list is: " + median);
    }
    
}
