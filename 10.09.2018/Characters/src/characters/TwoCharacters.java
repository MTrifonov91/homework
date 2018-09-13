/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters;

/**
 *
 * @author User
 */
public class TwoCharacters {
    
    public static void main (String [] args){
        
        MyCharacter Meister = new MyCharacter("black", "vampire", "male", 741);
        MyCharacter Undertaker = new MyCharacter("green", "werewolf", "male", 5);
        System.out.println(Meister + "\n" + Undertaker);
        
        
        
    }
}
