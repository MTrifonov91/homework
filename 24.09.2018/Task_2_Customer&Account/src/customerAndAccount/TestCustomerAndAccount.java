/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerAndAccount;

/**
 *
 * @author User
 */
public class TestCustomerAndAccount {
    public static void main(String[] args) {
        Customer pepa = new Customer(4169186, "Pepa Pig", 'f');
        System.out.println(pepa);
        Account pepasAccount = new Account(16168, pepa);
        System.out.println(pepasAccount);
        Account pepasAccount2 = new Account(16169, pepa, 4000000.00);
        System.out.println(pepasAccount2);
        pepasAccount2.deposit(5.5);
        System.out.println(pepasAccount2);
        pepasAccount2.withdraw(5000000);
        System.out.println(pepasAccount2);
        pepasAccount2.withdraw(500000);
        System.out.println(pepasAccount2);
        
    }
    
}
