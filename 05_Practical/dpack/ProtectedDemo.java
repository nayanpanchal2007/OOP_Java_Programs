package dpack;

import bpack.B;
import cpack.C;

public class ProtectedDemo {
    public static void main(String[] args) {
        B b = new B(5, 10, 15);
        b.display();

        System.out.println();

        C c = new C();
        c.display();
    }
}
