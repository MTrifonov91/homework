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
public class MeanMedian2 {Scanner in = new Scanner(System.in);
    private int size;
    private int[] numbers = new int[20];
    private int number;
    private final String exit = "end";
    private String enteredValue;
    
    
    
    public MeanMedian2() {
    }
    
    public void getTheNUmbersFromTheUser() {
        for (int i = 0; i<20; i++) {
            System.out.println("Enter number or type ''end'' to stop entering nummbers ");
            enteredValue = in.nextLine();
            if (enteredValue.equals(exit)) {
                size = i;
                break;
            }
            else{
                //size++;
                number = Integer.parseInt(enteredValue);
                numbers[i] = number;
                size = i+1;
            }
            
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(size);
        System.out.println(numbers[0]);
        
    }
    
    public void getTheCleanArray() {
        int[] endedNumbers = new int[size];
        for (int j = 0; j<size; j++) {
            endedNumbers[j] = numbers[j];
        }
        Arrays.sort(endedNumbers);
        System.out.println("Sorted clean array" + Arrays.toString(endedNumbers));
        int summ = 0;
        for (int i = 0; i<endedNumbers.length; i++) {
            summ += endedNumbers[i];
        }
        double mean = summ / endedNumbers.length;
        System.out.println("The mean of this list is: " + mean);
        double median=0;
        if (size%2==0) {
            double iNeedThisShit = (endedNumbers[size/2] + endedNumbers[(size/2)-1]) ;
            median = iNeedThisShit/2;
        }
        else {
            median = endedNumbers[size/2];
        }
        System.out.println("The median of this list is: " + median);
        
        
        
    }
    
}
