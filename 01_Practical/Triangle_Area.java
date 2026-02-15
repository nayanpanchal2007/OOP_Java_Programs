// Write a program that takes the lengths of three sides of a triangle as input. Calculate and print the area of the triangle. Ensure that the program validates if the given side lengths can actually form a triangle (sum of any two sides must be greater than the third side) before calculating the area (use Heron's formula: Area = sqrt(s*(s-a)*(s-b)*(s-c)) where s = (a+b+c)/2).
import java.util.Scanner;

public class Triangle_Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        double area, s;

        System.out.print("Enter a: ");
        a = scanner.nextDouble();

        System.out.print("Enter b: ");
        b = scanner.nextDouble();

        System.out.print("Enter c: ");
        c = scanner.nextDouble();

        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            s = (a + b + c) / 2.0;
            area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            
            System.out.println("\nArea of Triangle = " + area + " unit²");
        } else {
            System.out.println("\nInvalid triangle sides. Cannot be form a triangle.");
        }

        scanner.close();
    }
}
