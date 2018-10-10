/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meanMediean;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author User
 */
public class MeanMedianList {
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();
    private int number;
    
    public MeanMedianList() {
        
    }
    
    public void getTheNUmbersFromTheUser() {
        for (int i = 0; i<5; i++) {
            System.out.println("Enter number");
            numbers.add(in.nextInt());
        }
        
        for (int i: numbers) {
            System.out.print(i + " | ");
        }
        System.out.println("");
    }
    
    public void sortTheArray() {
        Collections.sort(numbers);
        
        for (int i: numbers) {
            System.out.print(i + " | ");
        }
        System.out.println("");
        
    }
    
    public void getTheMean() {
        for (int i: numbers) {
            int summ += numbers[i]; 
        }
    }
    
    
    
}
