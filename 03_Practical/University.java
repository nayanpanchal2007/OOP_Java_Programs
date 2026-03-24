// Create a Java class named University with a static data member totalStudents to keep track of the number of student objects created. Implement a static method getTotalStudents(). Also, include a static block to initialize a static variable (e.g., universityName) and an instance block to print a message when an object is created. Demonstrate their execution order.
public class University {
    static String universityName;
    static int totalStudents = 0;

    String studentName;
    int studentId;

    static {
        universityName = "Vishwakarma Government Engineering College";
        System.out.println("University Name: " + universityName);
    }

    {
        totalStudents++;
        System.out.println("Instance block executed.");
        System.out.println("Object #" + totalStudents + " is created.");
    }

    University(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    static int getTotalStudents() {
        return totalStudents;
    }

    void display() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("University: " + universityName);
    }

    public static void main(String[] args) {
        University s1 = new University("Nayan", 84);
        University s2 = new University("Dhruv", 8);
        University s3 = new University("Chriag", 21);

        System.out.println("Student details:");
        System.out.println("\nStudent 1: ");
        s1.display();
        System.out.println("\nStudent 2:");
        s2.display();
        System.out.println("\nStudent 3:");
        s3.display();

        System.out.println("\nTotal Students: " + getTotalStudents());
    }
}
