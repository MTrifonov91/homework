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
public class TestCustomerAndInvoice {
    
    public static void main(String [] args) {
        Customer george = new Customer(151618518, "George", 15);
        System.out.println(george);
        
        Invoice first = new Invoice(64168186, george, 500);
        System.out.println(first);   
        
        
    }
    
}
