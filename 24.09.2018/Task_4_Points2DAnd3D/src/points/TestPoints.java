/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package points;

/**
 *
 * @author User
 */
public class TestPoints {
    public static void main(String[] args) {
        Point2D firstPoint = new Point2D(5.2f, 2.1f);
        System.out.println(firstPoint);
        Point2D secondPoint = new Point2D();
        System.out.println(secondPoint);
        secondPoint.setX(5.2f);
        System.out.println(secondPoint);
        secondPoint.setY(2.1f);
        System.out.println(secondPoint);
        secondPoint.setXY(2.9f, 1.4f);
        System.out.println(secondPoint);
        
        Point3D thirdPoint = new Point3D(6.1f, 8.9f, 10.0f);
        System.out.println(thirdPoint);
        Point3D fourthPoint = new Point3D();
        System.out.println(fourthPoint);
        fourthPoint.setX(4.4f);
        System.out.println(fourthPoint);
        fourthPoint.setY(5.5f);
        System.out.println(fourthPoint);
        fourthPoint.setZ(6.6f);
        System.out.println(fourthPoint);
        fourthPoint.setXY(2.9f, 1.4f);
        System.out.println(secondPoint);
        fourthPoint.setXYZ(6.6f, 6.6f, 6.6f);
        System.out.println(fourthPoint);
        
        
    }
    
}
