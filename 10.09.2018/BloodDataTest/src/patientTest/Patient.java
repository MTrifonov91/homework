/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientTest;
import bloodDataTest.BloodData;
/**
 *
 * @author User
 */
public class Patient {
    private int idNumber;
    private int age;
    BloodData Blooddata;

    Patient() {
        this.idNumber = 0;
        this.age = 0;
        this.Blooddata = Blooddata;
    }
    Patient(int idNumber, int age, BloodData Blooddata) {
        this.idNumber = idNumber;
        this.age = age;
        this.Blooddata = Blooddata;
        
        
    
    
    }

    @Override
    public String toString() {
        return "Patient{" + "idNumber=" + idNumber + ", age=" + age + ", Blooddata=" + Blooddata + '}';
    }
}
