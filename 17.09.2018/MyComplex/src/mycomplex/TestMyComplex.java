/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycomplex;

/**
 *
 * @author User
 */
public class TestMyComplex {
    
    public static void main(String[] args) {
        MyComplex oneC = new MyComplex();
        MyComplex twoC = new MyComplex(1.5, 2.5);
        
       
        
        
        
        System.out.println(oneC);
        System.out.println(twoC);
        System.out.println(oneC.isReal());
        System.out.println(twoC.argument());
        
    }
    
   
    
}
