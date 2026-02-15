// Write a Java program that prompts the user to enter a single letter (character). Determine whether the entered character is a vowel (a, e, i, o, u, case-insensitive) or a consonant, and display the result.
import java.util.Scanner;

public class Check_Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Vowel and Consonant Checker ===");
        System.out.print("Enter a character: ");
        char c = scanner.next().charAt(0);

        c = Character.toLowerCase(c);

        if (!Character.isLetter(c)) {
            System.out.println(c + " is not a letter.");
            return;
        }

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println(c + " is a VOWEL.");
        } else {
            System.out.println(c + " is a CONSONANT.");
        }
        
        scanner.close();
    }
}