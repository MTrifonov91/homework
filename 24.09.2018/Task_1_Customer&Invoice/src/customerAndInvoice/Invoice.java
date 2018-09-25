/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerAndInvoice;

/**
 *
 * @author User
 */
public class Invoice {
    
    private int ID;
    private Customer customer;
    private double amount;
    
    public Invoice(int ID, Customer customer, double amount) {
        this.ID = ID;
        this.customer = customer;
        this.amount = amount;
    }
    
    public int getID() {
        return ID;
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public String getCustomerName() {
        return customer.getName();
    }
    
    public double getAmountAfterDiscount() {
        amount -= (amount / 100) * customer.getDiscount();
        return amount;
    }
    
    @Override
    public String toString() {
        return "Invoice " + ID + "\ncustomer data - " + customer + 
                "\namount to pay" + amount + "\n discount=" + customer.getDiscount() +
                     "\namount to pay with discount applied" + getAmountAfterDiscount();
    }
    
}
