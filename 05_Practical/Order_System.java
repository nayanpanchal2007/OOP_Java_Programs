/**
 * 5.3 Design a Java program for an Online Order Processing System using partial
 * interface implementation. Create an interface Order with three methods:
 *  placeOrder(String item, int qty)
 *  cancelOrder(int orderId)
 *  generateBill()
 * Create an abstract class PartialOrder that implements the Order interface but
 * provides implementation only for placeOrder() (storing order details). Create
 * a concrete class FinalOrder that extends PartialOrder and implements the
 * remaining methods cancelOrder() and generateBill(). Accept user input for
 * order details and allow user to either generate a bill or cancel the order.
 */
import java.util.Scanner;

interface Order {
    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}

abstract class PartialOrder implements Order {
    protected String item;
    protected int qty;
    protected int orderId;
    protected double pricePerUnit = 100;

    public void placeOrder(String item, int qty) {
        this.item = item;
        this.qty = qty;
        this.orderId = (int)(Math.random() * 1000);

        System.out.println("Order placed successfully!");
        System.out.println("Order ID: " + orderId);
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + qty);
    }
}

class FinalOrder extends PartialOrder {
    public void cancelOrder(int orderId) {
        if (this.orderId == orderId) {
            System.out.println("Order Id " + orderId + " has been cancelled.");
        } else {
            System.out.println("Invalid Order Id!");
        }
    }

    public void generateBill() {
        double total = qty * pricePerUnit;
        System.out.println("\n----- Bill -----");
        System.out.println("Order ID: " + orderId);
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + qty);
        System.out.println("Price per Unit: " + pricePerUnit);
        System.out.println("Total Amount: " + total);
    }
}

public class Order_System {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FinalOrder order = new FinalOrder();

        System.out.print("Enter item name: ");
        String item = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int qty = scanner.nextInt();

        order.placeOrder(item, qty);

        System.out.println("\nChoose the option:");
        System.out.println("1. Generate Bill");
        System.out.println("2. Cancel Order");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                order.generateBill();
                break;
            case 2:
                System.out.print("Enter order id to cancel: ");
                int id = scanner.nextInt();
                order.cancelOrder(id);
                break;
            default:
                System.out.println("Invalid choice!");
        }
        scanner.close();
    }
}