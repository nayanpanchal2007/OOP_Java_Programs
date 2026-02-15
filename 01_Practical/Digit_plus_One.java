// Write a Java program that accepts a five-digit integer from the keyboard. Your program should then create a new number by adding one to each digit of the input number. For example, if the input is 12391, the output should be 23402 (note: 9+1=10, so it becomes 0 with a carry)

import java.util.Scanner;

public class Digit_plus_One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("Enter a number of five digits: ");
        num = scanner.nextInt();
        
        int result = 0;
        int place = 1;

        while (num > 0) {
            int digit = num % 10;
            digit = (digit + 1) % 10;

            result = result + digit * place;
            place *= 10;
            num /= 10;
        }

        System.out.println("New number = " + result);
        scanner.close();
    }
}
