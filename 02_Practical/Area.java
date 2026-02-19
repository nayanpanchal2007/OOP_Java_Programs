class Rectangle {
    double width;
    double height;

    // constructor without parameters
    Rectangle() {
        width = 1;
        height = 1;
    }

    // constructor with parameters
    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    // getArea() function returns rectangle's area
    double getArea() {
        return width * height;
    }

    // getPerimeter() function returns rectangle's perimeter
    double getPerimeter() {
        return 2 * (width + height);
    }
}

public class Area {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("===Rectangle 1:===");
        System.out.println("Width = " + r1.width);
        System.out.println("Height = " + r1.height);
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());

        System.out.println();

        Rectangle r2 = new Rectangle(5, 3);
        System.out.println("===Rectangle 2:===");
        System.out.println("Width = " + r2.width);
        System.out.println("Height = " + r2.height);
        System.out.println("Area = " + r2.getArea());
        System.out.println("Perimeter = " + r2.getPerimeter());
    }
}