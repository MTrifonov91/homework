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
public class TestQuadrilaterals {
    public static void main(String[] args) {
        Quadrilateral q = new Quadrilateral(1,1,1,2,2,2,2,1);
        System.out.println(q);
        Trapezoid t = new Trapezoid(1,1,1.2,2,1.8,2,2,1);
        System.out.println(t);
        Parallelogram p = new Parallelogram(1,1,1.2,2,2.2,2,2,1);
        System.out.println(p);
        Rectangle r = new Rectangle(1,1,1,3,2,3,2,1);
        System.out.println(r);
        Square s = new Square(1,1,1,2,2,2,2,1);
        System.out.println(s);
    }
    
}
