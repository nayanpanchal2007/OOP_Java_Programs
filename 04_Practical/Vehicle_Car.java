/**
 * Create a base class named Vehicle that contains common attributes such as vehicleNumber, brand, and fuelType. Include a constructor to initialize these fields and a method displayDetails() to print them. Derive a subclass Car from Vehicle which adds attributes such as numberOfSeats and ACavailable (boolean). Override the displayDetails() method to include the car-specific details, and use the super keyword to invoke the parent class constructor and methods. Further, derive another subclass ElectricCar from Car that includes attributes such as batteryCapacity and chargingTime, and again override the displayDetails() method to include electric car-specific details. Demonstrate constructor chaining, method overriding, use of protected access specifier for inherited members, and instanceof operator to check object type at runtime. In the main() method, create objects of all three classes and display their details using overridden methods. Also, use upcasting (Vehicle v = new Car(...)) and downcasting with instanceof check to access subclass- specific features. 
 */

class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    Vehicle(String vehicleNumber, String brand, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.fuelType = fuelType;
    }

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    protected int numberOfSeats;
    protected boolean ACavailable;

    Car(String vehicleNumber, String brand, String fuelType, int numberOfSeats, boolean ACavailable) {
        super(vehicleNumber, brand, fuelType);
        this.numberOfSeats = numberOfSeats;
        this.ACavailable = ACavailable;
    }

    void displayDetails() {
        System.out.println("Car Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("AC Aailable: " + ACavailable);
    }
}

class ElectricCar extends Car {
    protected double batteryCapacity;
    protected double chargingTime;

    ElectricCar(String vehicleNumber, String brand, String fuelType, int numberOfSeats, boolean ACavailable, double batteryCapacity, double chargingTime) {
        super(vehicleNumber, brand, fuelType, numberOfSeats, ACavailable);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    void displayDetails() {
        System.out.println("Electric Car Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charing Time: " + chargingTime + " hrs");
    }
}

public class Vehicle_Car {
    public static void main(String[] args) {
        Vehicle v1 =  new Vehicle("GJ01AB1234", "TVS", "Petrol");
        Car c1 = new Car("GJ02CD5678", "Tata", "Petrol", 5, true);
        ElectricCar e1 = new ElectricCar("GJ03EF9999", "Tesla", "Electric", 5, true, 75, 1.5);

        System.out.println("----- Vehicle Details -----");
        v1.displayDetails();
        
        System.out.println("\n----- Car Details -----");
        c1.displayDetails();

        System.out.println("\n----- EV Car Details -----");
        e1.displayDetails();

        // Upcasting 
        System.out.println("\n----- Upcasting Example -----");
        Vehicle v = new Car("GJ04GH1111", "Honda", "Petrol", 4, true);
        v.displayDetails();

        // Downcasting
        System.out.println("\n----- Downcasting Example -----");
        if (v instanceof Car) {
            Car c = (Car)v;
            System.out.println("Downcasting successful!");
            c.displayDetails();
        } else {
            System.out.println("Downcasting not possible.");
        }
    }
}
