// Create a class BankAccount with accountId (String), accountHolderName (String), and balance (double) as instance variables. Include methods assignValues() (for initialization) and displayValues(). Implement a search function that takes an accountId as input and, if found within an array of BankAccount objects, displays the details of that specific account. In your main method, create an array of at least five BankAccount objects and demonstrate adding, displaying, and searching for accounts. 
import java.util.Scanner;

class BankAccount {
    String accountId;
    String accountHolderName;
    double balance;

    void assignValues(String id, String name, double bal) {
        accountId = id;
        accountHolderName = name;
        balance = bal;
    }

    void displayValues() {
        System.out.println("Account Id: " + accountId);
        System.out.println("Account holder name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    static void searchAccount(BankAccount[] accounts, String searchId) {
        boolean isFound = false;

        for (BankAccount acc : accounts) {
            if (acc.accountId.equals(searchId)) {
                System.out.println("\nAccount Found:");
                acc.displayValues();
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("\nAccount not found.");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount[] accounts = new BankAccount[5];
        
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new BankAccount();
            
            System.out.println("Enter details for Account " + (i + 1));
            System.out.print("Account ID: ");
            String id = scanner.nextLine();

            System.out.print("Account holder name: ");
            String name = scanner.nextLine();

            System.out.print("Balance: ");
            double bal = scanner.nextDouble();
            scanner.nextLine();

            accounts[i].assignValues(id, name, bal);
            System.out.println();
        }

        System.out.println("\nAll accounts details:");
        for (BankAccount acc : accounts) {
            acc.displayValues();
        }

        System.out.print("\nEnter account id to search: ");
        String seachId = scanner.nextLine();

        BankAccount.searchAccount(accounts, seachId);

        scanner.close();
    }
}
