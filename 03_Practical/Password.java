/**
 * Practical - 3.4
 * Create a Java method isValidPassword(String password) that checks if a given string is a valid password 
 * based on the following rules: 
 * ●   It must have at least eight characters. 
 * ●   It must consist only of letters and digits. 
 * ●   It must contain at least two digits. 
 * The program should prompt the user to enter a password and display "Valid Password" or "Invalid Password" accordingly. 
 */
import java.util.Scanner;
public class Password {
    static boolean isValidPassword(String password) {
        int digitCount = 0;
        if (password.length() < 8) {
            System.out.println("The password length should be 8 or more.");
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                System.out.println("The password only allows letters and digits.");
                return false;
            }

            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        if (digitCount < 2) {
            System.out.println("The password should contain at least 2 digits.");
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        System.out.print("Enter your password: ");
        password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("VALID PASSWORD");
        } else {
            System.out.println("NOT VALID PASSWORD");
        }
    }
}
