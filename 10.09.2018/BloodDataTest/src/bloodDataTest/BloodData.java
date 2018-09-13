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
public class BloodData {
    private char bloodType;
    private char rhFactor;

    public BloodData() {
        this.bloodType = 'O';
        this.rhFactor = '+';
    }
    public BloodData(char bloodType, char rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    public char getBloodType() {
        return bloodType;
    }

    public char getRhFactor() {
        return rhFactor;
    }

    public void setBloodType(char bloodType) {
        this.bloodType = bloodType;
    }

    public void setRhFactor(char rhFactor) {
        this.rhFactor = rhFactor;
    }

    @Override
    public String toString() {
        return "BloodData{" + "bloodType=" + bloodType + ", rhFactor=" + rhFactor + '}';
    }
    
    
    
}
