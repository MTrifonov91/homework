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
public class Account {
    private int ID;
    private Customer customer;
    private double balance = 0.0;
    
    public Account(int ID, Customer customer, double balance) {
        this.ID = ID;
        this.customer = customer;
        this.balance = balance;
    }
    
    public Account(int ID, Customer customer) {
        this.ID = ID;
        this.customer = customer;
    }
    
    public int getID() {
        return ID;
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    @Override
    public String toString() {
        return customer.getName() + "(" + ID + ") balance=$" + balance; 
    }
    
    public String getCustomerName() {
        return customer.getName();
    }
    
    public double deposit(double amount) {
        this.balance += amount;
        return balance;
    }
    
    public double withdraw(double amount) {
        if (this.balance >= amount){
            this.balance -= amount;
            return balance;
        }
        else{
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
        return balance;
    }
    
}
