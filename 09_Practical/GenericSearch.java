/**
 * 9.5 Write a generic method searchElement that accepts a LinkedList<T> and an
 * element T to search. Return true if the element exists, otherwise false.
 * ● Test with LinkedList<Integer> for roll numbers.
 * ● Test with LinkedList<String> for names.
 */

import java.util.LinkedList;

public class GenericSearch {

    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);

        LinkedList<String> names = new LinkedList<>();
        names.add("Nayan");
        names.add("Rahul");
        names.add("Amit");

        System.out.println("Search 102 in roll numbers: " + searchElement(rollNumbers, 102));
        System.out.println("Search 105 in roll numbers: " + searchElement(rollNumbers, 105));

        System.out.println("Search Rahul in names: " + searchElement(names, "Rahul"));
        System.out.println("Search Kiran in names: " + searchElement(names, "Kiran"));
    }
}