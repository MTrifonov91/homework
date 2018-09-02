/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersdemo;

/**
 *
 * @author MihailT
 */
public class NumbersDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int firstNumber;
        int secondNumber;
        
        displayTwiceTheNumber(5,9);
        displayNumberPlusFive(5,9);
        displayNumberSquared(5,9);
        
    }
    public static void displayTwiceTheNumber(int firstNumber, int secondNumber){
        System.out.print("Twice " + firstNumber + " = ");
            firstNumber *=2;
        System.out.println(firstNumber);    
        System.out.print("Twice " + secondNumber + " = ");
         secondNumber *=2;
        System.out.println(secondNumber);
        }
    public static void displayNumberPlusFive(int firstNumber, int secondNumber){
        System.out.print(firstNumber + " + 5 " + "= ");
            firstNumber +=5;
        System.out.println(firstNumber);    
        System.out.print(secondNumber + " + 5 " + "= ");
         secondNumber +=5;
        System.out.println(secondNumber);
        }
    public static void displayNumberSquared(int firstNumber, int secondNumber){
        System.out.print("Square of " + firstNumber + " = ");
            firstNumber *=firstNumber;
        System.out.println(firstNumber);    
        System.out.print("Square of " + secondNumber + " = ");
         secondNumber *=secondNumber;
        System.out.println(secondNumber);
        }
}
