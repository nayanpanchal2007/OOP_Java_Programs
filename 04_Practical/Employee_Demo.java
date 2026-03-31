/**
 * Create a base class named Employee that contains a method displayDetails()
 * which prints general employee details such as name and department. Now create
 * a subclass Manager that inherits from Employee and overrides the
 * displayDetails() method to include additional information such as the
 * manager's team size or project name. In the main method, create objects of
 * both Employee and Manager classes and call the displayDetails() method using
 * each object to show how Java determines which version of the method to
 * execute at runtime.
 */
class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Employee Name   : " + name);
        System.out.println("Department      : " + department);
    }
}

class Manager extends Employee {
    int teamSize;
    String projectName;

    Manager(String name, String department, int teamSize, String projectName) {
        super(name, department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    void displayDetails() {
        System.out.println("Manager Name    : " + name);
        System.out.println("Department      : " + department);
        System.out.println("Team Size       : " + teamSize);
        System.out.println("Project Name    : " + projectName);
    }
}

public class Employee_Demo {
    public static void main(String[] args) {
        Employee e = new Employee("Nayan", "IT");
        Manager m = new Manager("Dhruv", "Software", 10, "AI Project");

        System.out.println("Emplyee Details:-->");
        e.displayDetails();

        System.out.println("\nManager Details:-->");
        m.displayDetails();

        System.out.println("\nUsing Parents reference:-->");
        Employee ref;
        ref = e;
        ref.displayDetails();

        System.out.println();

        ref = m;
        ref.displayDetails();
    }
}
