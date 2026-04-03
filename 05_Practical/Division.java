import exam.Result;

/**
 * 5.1 Given an interface Classify with a method String getDivision(double average). Implement this getDivision method in a class Result such that it returns "First Division" if the average is 60 or more. 
 */

interface Classify {
    String getDivision(double average);
}

class Result implements Classify {
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        }
        return "No Division";
    }
}

public class Division {
    public static void main(String[] args) {
        Result r = new Result();
        System.out.println(r.getDivision(65));
    }
}