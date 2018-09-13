/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloodDataTest;

/**
 *
 * @author User
 */
public class TestBloodData {
    
    public static void main (String [] args){
        BloodData first = new BloodData();
        BloodData second = new BloodData('A','-');
        System.out.println(first);
        System.out.println(second);
    }
    
}
