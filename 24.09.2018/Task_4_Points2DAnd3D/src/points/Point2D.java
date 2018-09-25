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
public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;
    
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public Point2D() {
        
    }
    
    public float getX() {
        return x;
    }
    
    public void setX(float x) {
        this.x = x;
    }
    
    public float getY() {
        return y;
    }
    
    public void setY(float y) {
        this.y = y;
    }
    
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public float[] getXY() {
        float[] a = {x,y};
        return a;
    }
    
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    
    
}
