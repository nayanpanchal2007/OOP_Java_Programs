/**
 * Design a base class Shape with two double data members d1 and d2 to store dimensions. Include a method getData(double d1, double d2) to initialize these dimensions. Create two derived classes, Triangle and Rectangle, which inherit from Shape. Each derived class should have its own method to calculate its specific area. 
 */
class Shape {
    double d1, d2;

    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

class Triangle extends Shape {
    double calculateArea() {
        return (0.5 * d1 * d2);
    }
}

class Rectangle extends Shape {
    double calculateArea() {
        return d1 * d2;
    }
}

public class Shape_Inheritance {
    public static void main(String[] args) {
        // Triangle object
        Triangle t = new Triangle();
        t.getData(10, 5);
        System.out.println("Area of Triangle = " + t.calculateArea());

        // Rectangle object
        Rectangle r = new Rectangle();
        r.getData(10, 5);
        System.out.println("Area of Rectangle = " + r.calculateArea());
    }    
}
