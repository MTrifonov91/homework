/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiptopbakery;

/**
 *
 * @author User
 */
public class TestBread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bread Rye = new Bread ("rye", 56.50);
        System.out.println(Rye);
        Bread Yeast = new Bread ("yeast", 70.20);
        System.out.println(Yeast);
        Bread White = new Bread ("white", 75.55);
        System.out.println(White);
        
        
    }
    
}
