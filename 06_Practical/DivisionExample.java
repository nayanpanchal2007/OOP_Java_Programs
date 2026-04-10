/**
 * 6.1 Take the value of denominator and numerator from user using command-line argument. Implement the concept of exception handling to manage all possible run-time error. 
 */
public class DivisionExample {
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                throw new ArrayIndexOutOfBoundsException("Please provide two arguments");
            }

            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            int result = numerator / denominator;

            System.out.println("Result: " + result);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Insufficient arguments.");
        }

        catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        }

        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        catch (Exception e) {
            System.out.println("Unexpected Error: " + e);
        }

        finally {
            System.out.println("Program executed.");
        }
    }
}