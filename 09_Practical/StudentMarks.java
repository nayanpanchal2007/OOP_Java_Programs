/**
 * 9.1 Write a Java program that uses an ArrayList<Integer> to store marks of
 * students. Perform the following operations:
 * ● Add at least 5 marks.
 * ● Display all marks.
 * ● Find and display the highest and lowest marks using Collections.max() and
 * Collections.min().
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 student marks:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            int m = sc.nextInt();
            marks.add(m);
        }

        System.out.println("\nAll Student Marks:");
        for (int mark : marks) {
            System.out.println(mark);
        }

        int max = Collections.max(marks);
        int min = Collections.min(marks);

        System.out.println("\nHighest Mark: " + max);
        System.out.println("Lowest Mark: " + min);

        sc.close();
    }
}