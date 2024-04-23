package LAB_PBO_A.PT5_Inheritance.Study_Case1;

class Vehicle {
    String brand;
    double price;
    int numDoors;

    void start() {
        System.out.println(this.brand + " Menyala");
    }
}

class Car extends Vehicle{
    void brake() {
        System.out.println("Mobil " + super.brand + " Mengerem");
    }
}

class Motorcycle extends Vehicle{
    int engineCapacity;

    void accelerate() {
        System.out.println("Motor " + super.brand + " Bergerak dengan kecepatan " + this.engineCapacity);
    }
}

class Truck extends Vehicle{
    int loadCapacity;

    void load() {
        System.out.println("Truck " + super.brand + " Load " + this.loadCapacity);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.price = 1000000.0;
        car.numDoors = 4;

        car.start();
        car.brake();

        Motorcycle motor = new Motorcycle();
        motor.brand = "Honda";
    }
    
}
