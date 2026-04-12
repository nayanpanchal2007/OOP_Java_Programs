/**
 * 9.6 Write a generic method sortList(List<T> list) that sorts elements of an
 * ArrayList<T>, where T extends Comparable<T>. Demonstrate with:
 * ● An ArrayList<Integer> of numbers.
 * ● An ArrayList<String> of names.
 * ● Display the list before and after sorting.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericSort {

    public static <T extends Comparable<T>> void sortList(List<T> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(78);
        numbers.add(23);

        ArrayList<String> names = new ArrayList<>();
        names.add("Nayan");
        names.add("Rahul");
        names.add("Amit");
        names.add("Kiran");

        System.out.println("Numbers before sorting: " + numbers);
        sortList(numbers);
        System.out.println("Numbers after sorting: " + numbers);

        System.out.println("\nNames before sorting: " + names);
        sortList(names);
        System.out.println("Names after sorting: " + names);
    }
}