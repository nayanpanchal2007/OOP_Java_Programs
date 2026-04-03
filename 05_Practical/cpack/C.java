package cpack;

import apack.A;

public class C {
    public void display() {
        A obj = new A(10, 20 ,30);
        System.out.println("In class C:");
        System.out.println("Public variable: " + obj.pubVar);

        // System.out.println("Protected variable: " + obj.protVar); // Error
        // System.out.println("Private variable: " + obj.privVar); // Error

        System.out.println("Private variable (via method): " + obj.getPrivVar());
    }
}
