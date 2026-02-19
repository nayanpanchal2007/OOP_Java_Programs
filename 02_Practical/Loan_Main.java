// A bank wants to offer a facility to calculate EMI (Equated Monthly Installment) for different types of loans. Design a class LoanCalculator with the following overloaded methods: 
// calculateEMI(int principal, int time, float rate): For home loans 
// calculateEMI(double principal, int time, double rate): For vehicle loans 
// calculateEMI(int principal, int time): For short-term personal loans with a fixed interest rate of 10% 
// Demonstrate the use of all three methods in the main method by calculating EMIs for different loan types.
class LoanCalculator {
    // Home Loans
    void calculateEMI(int principal, int time, float rate) {
        float monthlyRate = rate / (12 * 100);
        int months = time * 12;
        double emi = principal * monthlyRate * Math.pow(1 + monthlyRate, months) / (Math.pow(1 + monthlyRate, months) - 1);
        System.out.println("Home Loan EMI: Rs " + emi);
    }

    // Vehicle Loans
    void calculateEMI(double principal, int time, double rate) {
        double monthlyRate = rate / (12 * 100);
        int months = time * 12;
        double emi = principal * monthlyRate * Math.pow(1 + monthlyRate, months) / (Math.pow(1 + monthlyRate, months) - 1);
        System.out.println("Vehicle Loan EMI: Rs " + emi);
    }

    // Personal Loans
    void calculateEMI(int principal, int time) {
        double rate = 10;
        double monthlyRate = rate / (12 * 100);
        int months = time * 12;
        double emi = principal * monthlyRate * Math.pow(1 + monthlyRate, months) / (Math.pow(1 + monthlyRate, months) - 1);
        System.out.println("Personal Load EMI (10%): Rs " + emi);
    }
}

public class Loan_Main {
    public static void main(String[] args) {
        LoanCalculator loan = new LoanCalculator();

        loan.calculateEMI(500000, 10, 7.5f);
        loan.calculateEMI(300000, 5, 9.0);
        loan.calculateEMI(200000, 2);
    }
}
