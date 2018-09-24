/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distance;

/**
 *
 * @author User
 */
public class Test {
    public static void main(String[] args) {
        MyPoint defaultPosition = new MyPoint();
        MyPoint newPosition = new MyPoint(2,3);
        MyPoint anotherPosition = new MyPoint(1,1);
        
        System.out.println(defaultPosition);
        System.out.println(newPosition);
        System.out.println(anotherPosition);
        
        newPosition.setXY(5, 6);
        System.out.println(newPosition);
        
        System.out.println(newPosition.distance(6, 8));
        System.out.println(newPosition.distance(anotherPosition));
        System.out.println(newPosition.distance());
        
        System.out.println("_____________________________");
        MyTriangle firstTriangle = new MyTriangle(2,3,4,5,9,6);
        System.out.println(firstTriangle);
        System.out.println(firstTriangle.getPerimeter());
        System.out.println(firstTriangle.getType());
        
        MyTriangle secondTriangle = new MyTriangle(9,9,14,11,9,13);
        System.out.println(secondTriangle.getPerimeter());
        System.out.println(secondTriangle.getType());
        
        MyTriangle thirdTriangle = new MyTriangle(16,3,20,6,16,9);
        System.out.println(thirdTriangle.getPerimeter());
        System.out.println(thirdTriangle.getType());
    }
    
}
