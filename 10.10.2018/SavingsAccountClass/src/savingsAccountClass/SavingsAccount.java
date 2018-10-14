/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savingsAccountClass;

/**
 *
 * @author User
 */
public class SavingsAccount {
    
   static double annualInterestRate;
   private double savingsBalance;

   
   public SavingsAccount(double savingsBalance) {
       super();
       this.savingsBalance = savingsBalance;
   }

   public void calculateMonthlyInterest() {
       savingsBalance += savingsBalance * (annualInterestRate / 1200);
   }

   public static void modifyInterestRate(double newAnnualInterestRate) {
       annualInterestRate = newAnnualInterestRate;
   }

   public double getSavingsBalance() {
       return savingsBalance;
   }
    
}
