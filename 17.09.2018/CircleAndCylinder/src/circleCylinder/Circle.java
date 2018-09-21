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
public class Circle {
    private double radius = 1.0;
    private String color = "red";
    
    public Circle() {
        
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    
    @Override
    public String toString() {
        return "Circle[radius= " + radius + ", color = " + color + ", area = " + getArea() +"]";
    }
}
