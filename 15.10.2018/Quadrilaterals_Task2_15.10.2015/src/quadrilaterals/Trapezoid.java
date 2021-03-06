/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadrilaterals;

/**
 *
 * @author User
 */
public class Trapezoid extends Quadrilateral {
    
    double height;

    public Trapezoid(double x1, double y1, double x2, double y2, double x3, 
            double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    
    public double height() {
        if(getA().getY()==getB().getY()) {
            return Math.abs(getB().getY()-getC().getY());
        }
        else {
            return Math.abs(getA().getY()-getB().getY());
        }    
    }
    
    public double area() {
        return sum()*height()/2.0;
    }
    
    public double sum() {
        if(getA().getY()==getB().getY()) {
            return Math.abs(getA().getX()-getB().getX()+Math.abs(getC().getX()-getD().getX()));
        }
        else {
            return Math.abs(getB().getX()-getC().getX()+Math.abs(getD().getX()-getA().getX()));
        }
    }

    @Override
    public String toString() {
        return "The Area is = " + area();
    }
    
    
    
    
    
    
}
