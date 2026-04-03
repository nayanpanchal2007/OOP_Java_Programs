package exam;

import student.Student;

public class Result extends Student {
    private int marks1, marks2, marks3;

    public Result(int rollNo, String name, int marks1, int marks2, int marks3) {
        super(rollNo, name);
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
    
    public void displayResult() {
        displayStudent();
        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
        System.out.println("Marks3: " + marks3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }

    public static void main(String[] args) {
        Result r = new Result(84, "Nayan", 70, 80, 90);
        r.displayResult();
    }
}
