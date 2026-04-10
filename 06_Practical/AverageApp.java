/**
 * 6.3 Write a Java application that defines a method average(String[] values)
 * which:
 * ● Accepts an array of strings as an argument.
 * ● Converts each string element into a double and computes the average.
 * ● If any array element is null, the method should throw a
 * NullPointerException.
 * ● If any element is not a valid number (e.g., "abc"), it should throw a
 * NumberFormatException.
 * ● Include the throws clause in the method declaration.
 * ● In the main method, demonstrate the working of this program with valid and
 * invalid inputs using try-catch-finally
 */

public class AverageApp {
    static double average(String[] values) throws NullPointerException, NumberFormatException {
        double sum = 0;
        for (String v : values) {
            if (v == null) {
                throw new NullPointerException("Null value found");
            }
            sum += Double.parseDouble(v);
        }
        return sum / values.length;
    }

    public static void main(String[] args) {
        String[][] testCases = {
            {"10", "20", "30"},
            {"5", null, "15"},
            {"10", "abc", "20"}
        };

        for (String[] arr : testCases) {
            try {
                double result = average(arr);
                System.out.println("Average: " + result);
            } catch (NullPointerException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid number format");
            } finally {
                System.out.println("Execution completed");
            }
        }
    }
}