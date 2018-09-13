/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circles;

/**
 *
 * @author User
 */
public class Circle {
    private double radius;
    private double diameter;
    private double area;
    
    Circle (double radius, double diameter, double area){
        this.radius = radius;
        this.diameter = diameter;
        this.area = area;
        
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setDiameter(double diameter) {
        this.diameter = radius*2;
    }

    public void setArea(double area) {
        this.area = (Math.PI * (radius*radius));
    }

    @Override
    public String toString() {
        return "Circle" + Circle.class + "{" + "radius=" + radius + ", diameter=" + diameter + ", area=" + area + '}';
    }
    
    
}
