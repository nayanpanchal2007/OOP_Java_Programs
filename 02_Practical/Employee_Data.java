import java.util.Scanner;

class Employee {
    public String employeeName;
    public double employeeSalary;

    public void readEmployeeData() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter name of the employee: ");
        employeeName = scanner.nextLine();

        System.out.print("Enter salary of the employee: ");
        employeeSalary = scanner.nextDouble();

        scanner.close();        
    }

    public void displayEmployeeData() {
        System.out.println("Employee name: " + employeeName);
        System.out.println("Employee salary: $" + employeeSalary);
    }
}

public class Employee_Data {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.readEmployeeData();
        System.out.println();
        emp.displayEmployeeData();

    }
}
