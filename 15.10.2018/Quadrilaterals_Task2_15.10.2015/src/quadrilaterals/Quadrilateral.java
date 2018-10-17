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
public class Quadrilateral {
    
    Point a,b,c,d;

    public Quadrilateral(double x1, double y1, double x2, double y2,double x3,
            double y3, double x4, double y4) {
        a = new Point(x1, y1);
        b = new Point(x2, y2);
        c = new Point(x3, y3);
        d = new Point(x4, y4);
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public Point getD() {
        return d;
    }

    @Override
    public String toString() {
        return "Quadrilateral{" + "a=" + getA() + ", b=" + getB() + ", c=" + getC() + ", d=" + getD() + '}';
    }
    
    
    
    
    
    
}
