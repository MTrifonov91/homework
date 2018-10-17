/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horses;

/**
 *
 * @author User
 */
public class TestHorses {
    
    public static void main(String[] args)
{  
  RaceHorse h1 = new RaceHorse("Gunter", "Black", 2012, 66);
  Horse h2 = new RaceHorse("Fritz", "Brown", 2010, 666);
  Horse h3 = new Horse("Mary", "White", 2014);  
  
  System.out.println(h1);
  System.out.println(h2);
  System.out.println(h3);
}
    
}
