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
public class MyTriangle {
    
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
   
    
   
    
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = new MyPoint();
        this.v2 = new MyPoint();
        this.v3 = new MyPoint();
    }

    @Override
    public String toString() {
        return "MyTriangle{" + v1 + "=(" + getX() + "," + getY() + ")," +
                v2 + "=(" + x2 + "," + y2 + ")," +
                v3 + "=(" + x3 + "," + x3 + "),"
    }
    
}
