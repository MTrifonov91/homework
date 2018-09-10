/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Student {
    private int idNUmber;
    private int creditHours=1;
    private int points=1;
    private double gradePointAverage = creditHours/points;
    
    
    Student(){
        idNUmber = 0;
        creditHours = 1;
        points = 1;
        gradePointAverage = creditHours/points;
    }
    public void setidNUmber (int idNUmber){
        this.idNUmber = idNUmber;
    }
    public void setcreditHours (int creditHours){
        this.creditHours = creditHours;
    }
    public void setpoints (int points){
        this.points = points;
    }
    public void setgradePointAverage (double gradePointAverage){
        this.gradePointAverage = (double) creditHours/ (double) points;
    }
    public int getidNUmber(){
        return idNUmber;
    }
    public int getcreditHours(){
        return creditHours;
    }
    public int getpoints(){
        return points;
    }
     public double getgradePointAverage(){
        return gradePointAverage;
     }    
}
