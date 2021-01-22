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

    //add
    public Complex add(Complex other){
        double ac = this.a + other.a;
        double bd = this.b + other.b;
        return new Complex(ac, bd);

    }
    //two doubles?
    public Complex add(double a, double b){
        return this.add(new Complex(a,b));
    }

    //toString
    public String toString(){
        return "" + a + " + " + b + "*" + "i";
    }

    //multiply
    public Complex multiple(Complex other){
        double ac = this.a * other.a;
        double bd = this.b * other.b;
        double first = ac - bd;

        double bc = this.b * other.a;
        double ad = this.a * other.b;
        double second = bc+ad;

        return new Complex (first, second);
    }

    public Complex multiply(double a, double b){
        return this.multiple(new Complex(a,b));
    }
}
