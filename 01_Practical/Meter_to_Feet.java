// Develop a Java program that prompts the user to enter a distance in meters. Your program should then convert his distance to feet (1 meter = 3.28084 feet) and display the result formatted to two decimal places.
import java.util.Scanner;

public class Meter_to_Feet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meter, feet;

        System.out.print("Enter distance in meters: ");
        meter = scanner.nextDouble();

        feet = meter * 3.28084;

        System.out.println("Distance in feet = " + feet);
        scanner.close();
    }
}
