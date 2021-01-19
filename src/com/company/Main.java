package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Complex c1 = new Complex(4,3);
        Complex c2 = new Complex(5,4);
        System.out.println(c1);
        System.out.println(c1.abs());
        System.out.println(c1.add(c2));
    }
}
