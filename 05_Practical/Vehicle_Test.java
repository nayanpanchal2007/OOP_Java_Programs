/**
 * 5.4 Write a Java program to create an abstract class Vehicle with:
 * ● An abstract method fuelType() that returns the type of fuel used.
 * ● An abstract method noOfWheels() that returns the number of wheels.
 * Create two subclasses:
 * ● Car that uses Petrol/Diesel and has 4 wheels.
 * ● Bike that uses Petrol and has 2 wheels.
 * In the main method, create objects of Car and Bike, and display their fuel
 * type and number of wheels.
 */

abstract class Vehicle {
    abstract String fuelType();
    abstract int noOfWheels();
}

class Car extends Vehicle {
    String fuelType() {
        return "Petrol/Diesel";
    }

    int noOfWheels() {
        return 4;
    }
}

class Bike extends Vehicle {
    String fuelType() {
        return "Petrol";
    }

    int noOfWheels() {
        return 2;
    }
}

public class Vehicle_Test {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        System.out.println("----- Car Details -----");
        System.out.println("Fuel Type: " + car.fuelType());
        System.out.println("No of Wheels: " + car.noOfWheels());

        System.out.println("\n----- Bike Details -----");
        System.out.println("Fuel Type: " + bike.fuelType());
        System.out.println("No of Wheels: " + bike.noOfWheels());
    }
}