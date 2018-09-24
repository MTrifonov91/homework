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
   
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
        
    }
   
    
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = new MyPoint();
        this.v2 = new MyPoint();
        this.v3 = new MyPoint();
    }

    @Override
    public String toString() {
        return "MyTriangle[v1=(" + v1 + "), v2={" + v2 + "}, v3=(" + v3 + ")";
    }
    
    public double getPerimeter() {
        
        return this.v1.distance(v2) + this.v2.distance(v3) + this.v3.distance(v1);
    }
    
    public String getType() {
        if (this.v1.distance(v2)==this.v2.distance(v3)&&
                this.v1.distance(v2)==this.v3.distance(v1)){
            return "This triangle is Equilateral";
        }
        if (this.v1.distance(v2)==this.v2.distance(v3)||
                this.v1.distance(v2)==this.v3.distance(v1)||
                    this.v2.distance(v3)==this.v3.distance(v1)){
            return "This triangle is Isosceles";
        }
        else{
            return "This triangle is Scalene";
        }
    }
    
    
}
