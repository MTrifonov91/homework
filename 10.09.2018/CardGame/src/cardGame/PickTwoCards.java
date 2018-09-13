/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardGame;
import java.lang.Math;

/**
 *
 * @author User
 */
public class PickTwoCards {
    
    public static void main (String [] args){
        int max = 13;
        int min = 1;
        int range = max - min + 1;
        int randomValue = (int)(Math.random()*range) + min;
        int randomValue2 = (int)(Math.random()*range) + min;
        Card firstCard = new Card('S',randomValue);
        Card secondCard = new Card ('C',randomValue2);
        
        System.out.println("Your first card is :" + firstCard);
        System.out.println("Your second card is :" + secondCard);
        
        
        
        
        
        
    }
    
}
