// Write a program for billing system for a shopping mall. Create a class BillGenerator that uses method overloading to generate bills based on customer type: 
// generateBill(int itemTotal): For regular customers, apply no discount. 
// generateBill(int itemTotal, int discount): For privileged customers, apply flat discount in rupees. 
// generateBill(int itemTotal, double discountPercent): For festive offers, apply percentage discount. 
// Write a program to display the final bill amount using appropriate overloaded method based on customer category. 
import java.util.Scanner;

class BillGenerator {
    // Regular Customer - No Discount
    void generateBill(int itemTotal) {
        System.out.println("Customer type: Regular");
        System.out.println("Final Bill Amount: Rs. " + itemTotal);
    }

    // Privileged Customer - Flat Discount
    void generateBill(int itemTotal, int discount) {
        int finalAmount = itemTotal - discount;
        if (finalAmount < 0) {
            finalAmount = 0;
        }
        System.out.println("Customer type: Privileged");
        System.out.println("Flat Discount: Rs. " + discount);
        System.out.println("Final Bill Amount: Rs. " + finalAmount);
    }

    // Festive Offer - Percentage Discount
    void generateBill(int itemTotal, double discountPercentage) {
        double discountAmount = itemTotal * discountPercentage / 100;
        double finalAmount = itemTotal - discountAmount;

        System.out.println("Customer type: Festive Offer");
        System.out.println("Discount Percent: " + discountPercentage + "%");
        System.out.println("Final Bill Amount: Rs. " + finalAmount);
    }
}

public class Shopping_Mall_Bill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BillGenerator bill = new BillGenerator();

        System.out.print("Enter total item amount: ");
        int total = scanner.nextInt();
        
        System.out.println("Select Customer Type:");
        System.out.println("1. Regular");
        System.out.println("2. Privileged");
        System.out.println("3. Festive Offer");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                bill.generateBill(total);
                break;
            case 2:
                System.out.print("Enter flat discount amount: ");
                int flatDiscount = scanner.nextInt();
                bill.generateBill(total, flatDiscount);
                break;
            case 3:
                System.out.print("Enter percentage discount: ");
                double percentageDiscount = scanner.nextDouble();
                bill.generateBill(total, percentageDiscount);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}