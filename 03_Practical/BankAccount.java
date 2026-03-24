// Design a class BankAccount with account_holder_name and balance. Use a static variable interest_rate (same for all accounts). Include methods to calculate and display the interest earned. Update interest rate using a static method. 
import java.util.Random;

public class BankAccount {
    private static double interestRate = 2.5;
    private String accountHolderName;
    private double balance;
    private String accountNumber = "";

    BankAccount(String name, double deposit) {
        Random random = new Random();
        accountHolderName = name;
        balance = deposit;
        for (int i = 0; i < 10; i++) {
            accountNumber += random.nextInt(10);
        }
        System.out.println("Account created for " + accountHolderName + " [" + accountNumber + "]");
    }    
    
    static void setInterestRate(double rate) {
        if (rate < 0) {
            System.out.println("New interest rate is invalid.");
            return;
        }
        System.out.println("Interest rate updated to " + rate + "%.");
        interestRate = rate;
    }

    static double getInterestRate() {
        return interestRate;
    }

    double calculateInterest(int years) {
        return (balance * interestRate * years) / 100;
    }

    void display(int years) {
        double interestEarned = calculateInterest(years);
        double totalAmount = balance + interestEarned;

        System.out.println();
        System.out.println("==========================================");
        System.out.println("            Account Report");
        System.out.println("==========================================");
        System.out.println("Account number      : " + accountNumber);
        System.out.println("Account holder name : " + accountHolderName);
        System.out.println("Balance             : " + balance);
        System.out.println("Interest Rate       : " + interestRate + "%");
        System.out.println("Period              : " + years);
        System.out.println("Interest Earned     : " + interestEarned);
        System.out.println("Total Amount        : " + totalAmount);
        System.out.println("==========================================");
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Bank Account Management System");
        System.out.println("Current interest rate: " + BankAccount.getInterestRate());

        BankAccount acc1 = new BankAccount("Nayan", 2000);
        BankAccount acc2 = new BankAccount("Dhruv", 2500);
        BankAccount acc3 = new BankAccount("Chirag", 3000);
        
        acc1.display(5);
        acc2.display(5);

        BankAccount.setInterestRate(3.5);

        acc3.display(5);
    }
}