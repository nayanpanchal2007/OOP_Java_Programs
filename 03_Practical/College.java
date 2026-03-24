// Write a Java program to model a college admission system using the concept of inner classes. Create an outer class named College that stores the collegeName as a data member and initializes it through a constructor. Within the College class, define a non-static inner class named Admission that contains student-specific details such as the studentName and the course they are enrolling in. The inner class should have methods to accept and display student information, and it should also be able to access and display the collegeName stored in the outer class. In the main method, create an object of the College class by passing the collegeName, and then use this object to create an instance of the inner Admission class. Invoke appropriate methods to input the student’s name and course, and then display the complete admission details, including the college name. 
import java.util.Scanner;

public class College {
    String collegeName;
    College(String name) {
        collegeName = name;
    }

    class Admission {
        String studentName;
        String course;

        void acceptDetails() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter student name: ");
            studentName = scanner.nextLine();

            System.out.print("Enter course enrolled: ");
            course = scanner.nextLine();

            scanner.close();
        }

        void displayDetails() {
            System.out.println("\n--------------   Admission Details   --------------");
            System.out.println("College name : " + collegeName);
            System.out.println("Student name : " + studentName);
            System.out.println("Course       : " + course);
        }
    }
    
    public static void main(String[] args) {
        College c = new College("Vishwakarma Government Engineering College");
        College.Admission a = c.new Admission();
        
        a.acceptDetails();
        a.displayDetails();
    }
}