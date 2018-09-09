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
public class Bread {
    private String breadType;
    private double caloriesPerSlice;
    public final static String motto = "The staff of life";

Bread (String breadType, double caloriesPerSlice){
    this.breadType = breadType;
    this.caloriesPerSlice = caloriesPerSlice;
    }    

    public String getBreadType() {
        return breadType;
    }

    public double getCaloriesPerSlice() {
        return caloriesPerSlice;
    }

    @Override
    public String toString() {
        return "Bread{" + motto + "\nbreadType=" + breadType + ", caloriesPerSlice=" + caloriesPerSlice + '}';
    }
    
    

     
    
    
    
    
    
    
    
}
