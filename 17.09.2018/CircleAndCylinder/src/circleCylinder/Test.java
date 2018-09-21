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
public class Test {
    public static void main(String[] args) {
        Circle firstCircle = new Circle();
        Circle secondCircle = new Circle(2.5);
        Circle thirdCircle = new Circle(3.1, "Green");
        
        Cylinder firstCylinder = new Cylinder();
        Cylinder secondCylinder = new Cylinder(2.0);
        Cylinder thirdCylinder = new Cylinder(2.1,8.1);
        Cylinder fourthCylinder = new Cylinder(2.2,8.0, "Blue");
        
        
        
        System.out.println(firstCircle + "\n" + secondCircle + "\n" + thirdCircle);
        System.out.println(firstCylinder + "\n" + secondCylinder + "\n" + thirdCylinder + "\n" + fourthCylinder);
    }
    
}
