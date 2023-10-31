package anudeep_practice;
// Parent class Vehicle
class Vehicle {
    // Attributes
    public String brand;
    public String model;
    public int year;

    // Constructor
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to drive the vehicle
    public void drive() {
        System.out.println("Driving the " + brand + " " + model);
    }
}

// Child class Car inheriting from Vehicle
class Car1 extends Vehicle {
    // Additional attribute
    private String color;

    // Constructor
    public Car1(String brand, String model, int year, String color) {
        super(brand, model, year);
        this.color = color;
    }

    // Method to honk the car's horn
    public void honk() {
        System.out.println("Honking the " + brand + " " + model + " in " + color + " color");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car1 myCar = new Car1("TATA", "PUNCH", 2023, "RED");

        // Call the "drive" method of the Vehicle class
        myCar.drive();

        // Call the "honk" method of the Car class
        myCar.honk();
    }
}