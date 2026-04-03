package bpack;

import apack.A;

public class B extends A {
    public B(int a, int b, int c) {
        super(a, b, c);
    }

    public void display() {
        System.out.println("In class B:");
        System.out.println("Public variable: " + pubVar);
        System.out.println("Protected variable: " + protVar);
        // Priavate variable not accessible directly to outside of class
        // System.out.println("Private variable: " + privVar); // Error
        System.out.println("Private variable (via method): " + getPrivVar());
    }
}
