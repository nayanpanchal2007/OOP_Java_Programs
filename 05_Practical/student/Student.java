/**
 * 5.5 Write a Java program using packages to generate a mark sheet for
 * students.
 * Create a package student that contains a class Student with the following:
 * ● Data members: rollNo, name.
 * ● A constructor to initialize student details.
 * ● A method displayStudent() to display student information.
 * Create another package exam that contains a class Result which:
 * ● Extends the Student class.
 * ● Has data members: marks1, marks2, marks3.
 * ● A method displayResult() that prints the student’s mark sheet including
 * total and average marks.
 * In the main method (inside the exam package), create a student with marks and
 * display the mark sheet.
 */

package student;

public class Student {
    protected int rollNo;
    protected String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}