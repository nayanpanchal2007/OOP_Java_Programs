// Write a Java program to solve a system of two linear equations with two variables (e.g., ax + by = e and cx + dy = f). Prompt the user to enter the coefficients a, b, c, d, e, f. Calculate and display the values of x and y using Cramer's rule. Include error handling for cases where the denominator is zero. 
// Cramer's rule : D=ad−bc, Dx=ed−bf, Dy=af−ce, x=Dx/D, y=Dy/D 
import java.util.Scanner;

public class Cramers_Rule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double D, Dx, Dy, x, y;

        System.out.println("Welcome to linear equation solver.");
        System.out.println("Your equations are: ax + by = e and cx + dy = f");
        System.out.println();
        
        System.out.print("a = "); double a = scanner.nextDouble();
        System.out.print("b = "); double b = scanner.nextDouble();
        System.out.print("c = "); double c = scanner.nextDouble();
        System.out.print("d = "); double d = scanner.nextDouble();
        System.out.print("e = "); double e = scanner.nextDouble();
        System.out.print("f = "); double f = scanner.nextDouble();

        // Cramer's rule
        D = (a * d) - (b * c);
        Dx = (e * d) - (b * f);
        Dy = (a * f) - (c * e);

        if (D <= 0) {
            System.out.println("No unique solution exists (Denominator is zero)."); 
        } else {
            x = Dx / D;
            y = Dy / D;

            System.out.println("Value of x = " + x);
            System.out.println("Value of y = " + y);
        }

        scanner.close();
    }
}