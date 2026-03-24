/**
 * Practical - 3.5 
 * Write a Java program that demonstrates method overloading to calculate the volume of different 3D shapes. Implement overloaded methods named calculateVolume() for a Cube (takes one side length), a RectangularCube (takes length, width, height), and a Sphere (takes radius). 
 */
import java.util.Scanner;
public class Shape {
    int calculateVolume(int side) {
        return side * side * side;
    }

    int calculateVolume(int length, int width, int height) {
        return length * width * height;
    }

    double calculateVolume(double radius) {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Shape v = new Shape();

        System.out.print("Enter the side of cube: ");
        int s = scanner.nextInt();
        System.out.println("Volume of cube = " + v.calculateVolume(s));

        System.out.println();

        System.out.print("Enter the length width height of rectangular cube: ");
        int l = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        System.out.println("Volume of rectangular cube = " + v.calculateVolume(l, w, h));

        System.out.println();
        
        System.out.print("Enter the radius of sphere: ");
        double r = scanner.nextDouble();
        System.out.println("Volume of sphere = " + v.calculateVolume(r));

        scanner.close();
    }
}
