/**
 * Define a base class BankAccount with common attributes like accountNumber, accountHolderName, and balance. Then, define two subclasses: SavingAccount and FixedDepositAccount, which inherit from BankAccount. Implement basic operations like openAccount(), deposit(), checkBalance(), and withdraw() in BankAccount. The SavingAccount should include a calculateInterest() method specific to savings accounts, and FixedDepositAccount should have a maturityAmount() method considering fixed deposit terms. 
 */
class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(int accNo, String name, double initialBalance) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = initialBalance;
        System.out.println("Account opened successfully!");
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    double interestRate = 2.5;

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest earned: " + interest);
    }
}

class FixedDepositAccount extends BankAccount {
    double rate = 6.5;
    int years;

    void setFDDetails(int years) {
        this.years = years;
    }

    void maturityAmount() {
        double maturity = balance * Math.pow((1 + rate / 100), years);
        System.out.println("Maturity Amount after " + years + " years: " + maturity);
    }
}

public class Bank {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.openAccount(101, "Nayan", 1000);    
        sa.deposit(300);
        sa.withdraw(800);
        sa.checkBalance();
        sa.calculateInterest();

        System.out.println("-----------------------------");

        FixedDepositAccount fda = new FixedDepositAccount();
        fda.openAccount(202, "Nayan", 5000);
        fda.setFDDetails(5);
        fda.checkBalance();
        fda.maturityAmount();
    }
}
