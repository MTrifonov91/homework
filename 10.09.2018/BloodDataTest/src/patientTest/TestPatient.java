/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientTest;
import bloodDataTest.BloodData;
import bloodDataTest.TestBloodData;
/**
 *
 * @author User
 */
public class TestPatient {
    
    public static void main (String [] args){
        BloodData first = new BloodData();
        BloodData second = new BloodData('A','-');
        Patient Wasea = new Patient();
        Patient Feghea = new Patient( 61616, 18, second);
        System.out.println(Wasea);
        System.out.println(Feghea);
        
    }
    
}
