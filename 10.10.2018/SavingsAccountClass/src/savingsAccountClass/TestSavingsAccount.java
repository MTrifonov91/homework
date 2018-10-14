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
public class TestSavingsAccount {
    public static void main(String[] args) {
   SavingsAccount saver1=new SavingsAccount(2000.00);
   SavingsAccount saver2=new SavingsAccount(3000.00);
   SavingsAccount.annualInterestRate=4;
  
   System.out.println("Saver 1#");
   System.out.println("Month\tBalance");
   for(int i=1;i<12;i++)
   {
       saver1.calculateMonthlyInterest();
       System.out.printf("%d\t%.2f\n",i,saver1.getSavingsBalance());
   }
   System.out.println("Saver 2#");
   System.out.println("Month\tBalance");
   for(int i=1;i<12;i++)
   {
       saver2.calculateMonthlyInterest();      
       System.out.printf("%d\t%.2f\n",i,saver2.getSavingsBalance());
   }
  
  
   System.out.println("After changing Interest rate to 5%");
   SavingsAccount.modifyInterestRate(5);
  
   System.out.println("Saver 1#");

       saver1.calculateMonthlyInterest();
       System.out.printf("New Balance of save 1 :%.2f\n",saver1.getSavingsBalance());
  
       System.out.println("Saver 2#");

           saver1.calculateMonthlyInterest();
           System.out.printf("New Balance of saver 2 :%.2f\n",saver1.getSavingsBalance());
  

   }
    
}
