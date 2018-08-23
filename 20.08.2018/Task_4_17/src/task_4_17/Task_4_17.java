/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_4_17;
import java.util.Scanner;

/**
 * This program calculates sales
 * @author MihailT
 */
public class Task_4_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        int product_number;
        int quantity;
        float total=0;
        float price1 = (float) 2.98;
        float price2 = (float) 4.50;
        float price3 = (float) 9.98;
        float price4 = (float) 4.49;
        float price5 = (float) 6.87;
        for (int i=1; i<=5; i++){
            System.out.println("Choose your product");
                switch (i){
                case (1):
                    System.out.println("Product 1 selected, price is " + price1 + "$");
                    System.out.println("Enter the quantity you want ot buy");
                    quantity = in.nextInt();
                    System.out.println("Total for this product is " + (quantity*price1));
                    total = quantity*price1;
                    System.out.println("Total so far = " + total + "$");
                    break;
                case (2):
                    System.out.println("Product 2 selected, price is " + price2 + "$");
                    System.out.println("Enter the quantity you want ot buy");
                    quantity = in.nextInt();
                    System.out.println("Total for this product is " + (quantity*price2));
                    total += quantity*price2;
                    System.out.println("Total so far = " + total + "$");
                    break;
                case (3):
                    System.out.println("Product 3 selected, price is " + price3 + "$");
                    System.out.println("Enter the quantity you want ot buy");
                    quantity = in.nextInt();
                    System.out.println("Total for this product is " + (quantity*price3));
                    total += quantity*price3;
                    System.out.println("Total so far = " + total + "$");
                    break;
                case (4):
                    System.out.println("Product 4 selected, price is " + price4 + "$");
                    System.out.println("Enter the quantity you want ot buy");
                    quantity = in.nextInt();
                    System.out.println("Total for this product is " + (quantity*price4));
                    total += quantity*price4;
                    System.out.println("Total so far = " + total + "$");
                    break;
                case (5):
                    System.out.println("Product 5 selected, price is " + price5 + "$");
                    System.out.println("Enter the quantity you want ot buy");
                    quantity = in.nextInt();
                    System.out.println("Total for this product is " + (quantity*price5));
                    total += quantity*price5;
                    System.out.println("Total so far = " + total + "$");
                    break;    
                    
            }
        }
    }
    
}
