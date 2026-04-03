/**
 * 5.2 Write the Java code for an interface named Exam which declares a single abstract method boolean isPassed(int mark). This method should take an integer mark as an argument. Write the Java code for another interface named Classify which declares a single abstract method String getDivision(double average). This method should take a double average as an argument. Create a class named Result that implements both the Exam and Classify interfaces. Provide concrete implementations for isPassed() and getDivision() methods. In your main method, create an instance of Result, set some marks and average, and demonstrate the use of both interface methods. 
 */
interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double average);
}

class Result implements Exam, Classify {
    public boolean isPassed(int mark) {
        return mark >= 40;
    }

    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else if (average >= 40) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }
}

public class Division_with_Interfaces {
    public static void main(String[] args) {
        Result r = new Result();
        int mark = 55;
        double average = 62.5;

        if (r.isPassed(mark)) {
            System.out.println("Student Passed.");
        } else {
            System.out.println("Student Failed.");
        }

        String division = r.getDivision(average);
        System.out.println("Division: " + division);
    }
}
