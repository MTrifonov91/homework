/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hugeInteger;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class HugeInteger {
    
    private int[] hugeNumber;
    private int[] hugeNumberToAdd;
    private String myHugeNumber;
    
    
    
    public HugeInteger(String enteredNUmber) {
        if (enteredNUmber.matches("[0-9]+") && enteredNUmber.length()<=40) {
            this.myHugeNumber = enteredNUmber;
        }
        else {
            System.out.println("Enter just numbers");
        }
        
    }
    
    
    public void parse() {
        hugeNumber = new int[myHugeNumber.length()];
        for (int i = 0; i<myHugeNumber.length(); i++) {
            hugeNumber[i] = Integer.parseInt(myHugeNumber.substring(i, i+1));
        }
        
    }
    
    public void parseNumberToAdd(String numberToAdd) {
        int[] hugeNumberToAdd = new int[numberToAdd.length()];
        for (int i = 0; i<numberToAdd.length(); i++) {
            hugeNumberToAdd[i] = Integer.parseInt(numberToAdd.substring(i, i+1));
        }
        
    }
    
    public HugeInteger add(String numberToAdd) {
          if (numberToAdd.matches("[0-9]+") && numberToAdd.length()<=40) {
            int [] hugeNumberToAdd = new int[numberToAdd.length()];
            parseNumberToAdd(numberToAdd);
        }
          
         
        int[] result;
        int carry = 0;
      
        if (myHugeNumber.length()>numberToAdd.length()) {
            result = new int[myHugeNumber.length()+1];
        }
        else{
            result = new int[numberToAdd.length()+1];
        }
        for (int i = result.length-1; i >=0; i--) {
            result[i+1] = hugeNumber[i] + hugeNumberToAdd[i] + carry;
        }
       
        
        
        
        
        
        return i;
    }
    
    
    @Override
    public String toString() {
        String returnMyHuge = "HugeInteger{";
        for (int i = 0; i<hugeNumber.length; i++) {
            returnMyHuge += hugeNumber[i];
        }
        return "HugeInteger{" + "hugeNumber=" + returnMyHuge + '}';
    }
    

    

    
    
    
    
    
    
    
    
    
    public HugeInteger substract(HugeInteger i) {
        return i;
    }
    
    public boolean isEqualTo(HugeInteger i) {
        return true;
    }
    
    public boolean isNotEqualTo(HugeInteger i) {
        return true;
    }
    
    public boolean isGreaterThan(HugeInteger i) {
        return true;
    }
    
    public boolean isLessThann(HugeInteger i) {
        return true;
    }
    
    public boolean isGreaterThanOrEqualTo(HugeInteger i) {
        return true;
    }
    
    public boolean isLessThanOrEqualTo(HugeInteger i) {
        return true;
    }
    
    
}
