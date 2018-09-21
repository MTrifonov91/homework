/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circleCylinder;

/**
 *
 * @author User
 */
public class Cylinder extends Circle {
    private double height = 1.0;
    
    public Cylinder() {
        
    }
    
    public Cylinder(double radius) {
        super.getRadius();
        
    }
    
    public Cylinder(double radius, double height) {
        super.getRadius();
        this.height = height;
        
    }
    
    public Cylinder(double radius, double height, String color) {
        super.getRadius();
        this.height = height;
        super.getColor();
        
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getVolume() {
        double volume = getArea() * height;
        return volume;
    }

    @Override
    public String toString() {
                return "Cylinder[radius= " + super.getRadius() + ", color = " + super.getColor() + ", volume = " + getVolume() +"]";
    }
    
    
    
    
}
