/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycomplex;

/**
 *
 * @author User
 */
public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;
    
    public MyComplex() {
        
    }
    
    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    
    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    
    public boolean isReal() {
        return (imag == 0);
    }
    
    public boolean isImaginary() {
        return (real == 0);
    }
    
    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }
    
    public boolean equals(MyComplex another) {
        double epsilon = 10E-8;
        return (real - another.getReal() <= epsilon && imag - another.getImag() <= epsilon);
    }
    
    public double magnitude() {
        return Math.sqrt(real*real + imag*imag);
    }
    
    public double argument() {
        return Math.atan2(imag, real);
    }
    
    public MyComplex add(MyComplex right) {
        return new MyComplex(real+right.getReal(), imag+right.getImag());
    }
    
    public MyComplex substract(MyComplex right) {
        return new MyComplex(real-right.getReal(), imag-right.getImag());
    }
    
    public MyComplex multiply(MyComplex right) {
        
        real = real*right.getReal() - imag*right.getImag();
        imag = real*right.getImag() + imag*right.getReal();
        return this;
    }
    public MyComplex conjugate() {
        return new MyComplex(real, -imag);
    }
    
     public MyComplex divide(MyComplex right) {
        // [(a + bi) * (c – di)] / (c2 + d2)
        MyComplex tmp = multiply(right.conjugate());
        double delimiter = right.getReal()*right.getReal() + right.getImag()*right.getImag();
        if (delimiter != 0) {
            real = tmp.getReal() / delimiter;
            imag = tmp.getImag() / delimiter;
        }
        return this;
    }
     
     @Override
    public String toString() {
        return "(" + real + "+" + imag + "i)";
    }
    
     
     
     
    
    
    
    
}
