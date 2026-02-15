// Simulate a simple ATM or cashier. Given an integer amount to be dispensed (e.g., 787), calculate and display the minimum number of currency notes of denominations 100, 50, 10, 5, 2, and 1 that would be given to the user.
import java.util.Scanner;

public class ATM_Notes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = 0;
        System.out.print("Enter a amount to withdraw: ");
        amount = scanner.nextInt();

        int note_100, note_50, note_10, note_5, note_2, note_1;
        note_100 = amount / 100;
        amount %= 100;

        note_50 = amount / 50;
        amount %= 50;

        note_10 = amount / 10;
        amount %= 10;

        note_5 = amount / 5;
        amount %= 5;

        note_2 = amount / 2;
        amount %= 2;

        note_1 = amount;

        System.out.println("\nMinimum notes required:");
        System.out.println("100 = " + note_100);
        System.out.println("50 = " + note_50);
        System.out.println("10 = " + note_10);
        System.out.println("5 = " + note_5);
        System.out.println("2 = " + note_2);
        System.out.println("1 = " + note_1);
        
        scanner.close();
    }
}