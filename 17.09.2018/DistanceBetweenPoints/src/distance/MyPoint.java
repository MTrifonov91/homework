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
public class MyPoint {
        private int x = 0;
        private int y = 0;
        
        
    public MyPoint() {
    }
    
    public MyPoint(int x,int y) {
        this.x = x;
        this.y = y;
    }  

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public int[] getXY() {
        int[] a = {x,y};
        return a;
    }
    
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" + x + "," + y + ")" ;
    }
    
    public double distance(int x, int y) {
        double diffX = (x-getX());
        double diffY = (y-getY());
        return Math.sqrt((Math.pow(diffX, 2))+(Math.pow(diffY, 2)));
    }
    
    public double distance(MyPoint another) {
        double diffX = (getX()-another.x);
        double diffY = (getY()-another.y);
        return Math.sqrt((Math.pow(diffX, 2))+(Math.pow(diffY, 2)));
        
    }
    
    public double distance() {
        return Math.sqrt((Math.pow(getX(), 2))+(Math.pow(getY(), 2)));
    }
    
    
    
    
        
}
