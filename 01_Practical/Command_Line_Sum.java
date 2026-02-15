// Write a Java program that accepts two numbers as command-line arguments. Convert these arguments to appropriate numeric types (e.g., int or double), perform a simple calculation (e.g., sum or product), and print the result to the console.
public class Command_Line_Sum {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide exactly two numbers.");
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);

        double sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }
}
