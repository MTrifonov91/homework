/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billing;

/**
 *
 * @author User
 */
public class Billing {
    
    double photoBookPrice;
    double quantity;
    double couponValue;
    
    
    public static double computeBill(double photoBookPrice){
        return photoBookPrice+=photoBookPrice*0.08;
    }
    public static double computeBill(double photoBookPrice, double quantity){
        double total = photoBookPrice * quantity;
        return total+=total*0.08;
    }
    public static double computeBill(double photoBookPrice, double quantity, double couponValue ){
        double total = (photoBookPrice * quantity) - couponValue;
        return total+=total*0.08;
    }

    @Override
    public String toString() {
        return (" Total cost =  " + computeBill(photoBookPrice) +
                " Total cost =  " + computeBill(photoBookPrice, quantity) +
                " Total cost =  " + computeBill(photoBookPrice, quantity, couponValue));
    }
    
    
    
    public static void main (String [] args){
               
        
        System.out.println(computeBill(25.5));
        System.out.println(computeBill(25.5, 3));
        System.out.println(computeBill(25.5, 3, 15.1));
    }
    
}
