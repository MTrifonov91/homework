/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

/**
 *
 * @author User
 */
public class TestTime {
    
    public static void main (String [] args ) {
        
        Time now = new Time(1,2,3);
        System.out.println(now);
        
        now.setTime(2, 40, 59);
        System.out.println(now);
        
        now.nextSecond();
        System.out.println(now);
        
        now.previousSecond();
        System.out.println(now);
                
        
       
    }
    
}
