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
public class MyCircle {

    private MyPoint center;
    private int radius = 1;

    public MyCircle() {
        this.center = new MyPoint(0, 0);
    }

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX() {
        return this.center.getX();
    }

    public int getCenterY() {
        return this.center.getY();
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    public int[] getCenterXY() {
        return new int[]{this.center.getX(), this.center.getY()};
    }

    public void setCenterXY(int x, int y) {
        this.center.setX(x);
        this.center.setY(y);
    }

    @Override
    public String toString() {
        return "MyCircle{" + "center=" + center + ", radius=" + radius + '}';
    }

    public double distance(MyCircle anotherCircle) {
        return this.getCenter().distance(anotherCircle.getCenter());
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getCircumference(){
        return 2 * Math.PI * this.radius;
    }
}
