import java.util.Scanner;

public class Even_Odd_check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is EVEN.");
        } else {
            System.out.println(num + " is ODD.");
        }
        
        scanner.close();
    }
}
