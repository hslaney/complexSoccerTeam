package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Complex c1 = new Complex(4,3);
        Complex c2 = new Complex(5,-4);
        Complex c3 = new Complex(-3, -2);
        Complex c4 = new Complex(-1,1);

        System.out.println("c1 : " + c1);
        System.out.println("c2 : " + c2);
        System.out.println("c3 : " + c3);
        System.out.println("c4 : " + c4);

        System.out.println();

        System.out.println("c1 abs : " + c1.abs());
        System.out.println("c2 abs : " + c2.abs());
        System.out.println("c3 abs : " + c3.abs());
        System.out.println("c4 abs : " + c4.abs());

        System.out.println();

        System.out.println("c1 + c2 : " + c1.add(c2));
        System.out.println("c3 + c4 : " + c3.add(c4));
        System.out.println("c1 + c3 : " + c1.add(-3, -2));
        System.out.println("c2 + c4 : " + c2.add(-1, 1));

        System.out.println();

        System.out.println("c1 * c2 : " + c1.multiple(c2));
        System.out.println("c3 * c4 : " + c3.multiple(c4));
        System.out.println("c1 * c3 : " + c1.multiply(-3, -2));
        System.out.println("c2 * c4 : " + c2.multiply(-1, 1));
    }
}
