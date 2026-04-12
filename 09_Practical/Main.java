/**
 * 9.4 Create a generic class Box<T> with a method addItem(T item) that stores
 * items in an ArrayList<T>. Demonstrate the class by:
 * ● Creating a Box<String> for names.
 * ● Creating a Box<Integer> for roll numbers.
 * ● Display stored items for both.
 */

import java.util.ArrayList;

class Box<T> {
    ArrayList<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Box<String> nameBox = new Box<>();
        nameBox.addItem("Nayan");
        nameBox.addItem("Rahul");
        nameBox.addItem("Amit");

        Box<Integer> rollBox = new Box<>();
        rollBox.addItem(101);
        rollBox.addItem(102);
        rollBox.addItem(103);

        System.out.println("Names:");
        nameBox.displayItems();

        System.out.println("\nRoll Numbers:");
        rollBox.displayItems();
    }
}