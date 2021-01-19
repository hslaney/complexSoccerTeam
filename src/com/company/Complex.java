package com.company;

public class Complex {
    //instance variables
    private double a;
    private double b;

    //constructors
    public Complex(double a){
        this(a,0.0);
    }
    public Complex(double a, double b){
        this.a = a;
        this.b = b;
    }

    //abs
    public double abs(){
        return Math.sqrt(a*a + b*b);
    }

    //add 2?
    public Complex add(Complex other){
        double ac = this.a + other.a;
        double bd = this.b + other.b;
        return new Complex(ac, bd);

    }

    //toString
    public String toString(){
        return "" + a + " + " + b + "*" + "i";//i?
    }


}
