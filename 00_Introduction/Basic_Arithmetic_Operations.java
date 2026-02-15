import java.util.Scanner;

public class Basic_Arithmetic_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        int choice;
        double result = 0;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        System.out.println("Operations:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulo");
        System.out.print("Choose the operation: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                result = num1 / num2;
                break;
            case 5:
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                result = num1 % num2;
                break;
            default:
                System.out.println("Enter your choice from the given list.");
        }

        System.out.println("Result = " + result);

        scanner.close();
    }
}
