// Define a Java class named Rectangle. It should have two double data fields: width and height. In your main method, create two Rectangle objects: one with width 4 and height 40, and another with width 3.5 and height 35.9. For each rectangle, display its width, height, calculated area, and perimeter. Then, compare the two rectangles based on their areas and print which one has a larger area. 
class Rectangle {
    double width;
    double height;

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    void display() {
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Area = " + getArea());
        System.out.println("Perimeter = " + getPerimeter());
        System.out.println();
    }
}

public class Rectangle_Area {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.println("---Rectangle 1 details---");
        r1.display();
        System.out.println("---Rectangle 2 details---");
        r2.display();

        if (r1.getArea() > r2.getArea()) {
            System.out.println("Rectangle 1 has larger area.");
        } else if (r1.getArea() < r2.getArea()) {
            System.out.println("Rectangle 2 has larger area.");
        } else {
            System.out.println("Both rectangle have equal area.");
        }
    }
}