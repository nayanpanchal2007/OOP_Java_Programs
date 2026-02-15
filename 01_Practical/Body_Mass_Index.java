// Develop a Java application that calculates a person's Body Mass Index (bmi). The program should ask the user for their weight in pounds and height in inches. Convert these values to kilograms and meters respectively (1 pound = 0.45359237 kg, 1 inch = 0.0254 meters) and then calculate bmi (weight in kg / (height in meters)^2). Display the calculated bmi.
import java.util.Scanner;

public class Body_Mass_Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight_pounds;
        double height_inches;
        double weight_kgs;
        double height_meters;
        double bmi;

        System.out.print("Enter a weight in pounds: ");
        weight_pounds = scanner.nextDouble();

        System.out.print("Enter a height in inches: ");
        height_inches = scanner.nextDouble();

        weight_kgs = weight_pounds * 0.45359237;
        height_meters = height_inches * 0.0254;

        bmi = weight_kgs / (height_meters * height_meters);

        System.out.println("Calculated BMI = " + bmi);

        scanner.close();
    }
}