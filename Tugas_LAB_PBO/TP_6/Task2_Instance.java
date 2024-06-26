package Tugas_LAB_PBO.TP_6;

import Tugas_LAB_PBO.TP_6.Task1_Classes.Car;
import Tugas_LAB_PBO.TP_6.Task1_Classes.Smartphone;
import Tugas_LAB_PBO.TP_6.Task1_Classes.Dog.*;

public class Task2_Instance {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone(9000000, "ROG");
        Car mobil = new Car(6, "Silver", 500);
        Pitbull dog = new Pitbull(0, 4);

        System.out.println("=".repeat(50));
        System.out.println("                    INFO PHONE                    ");
        System.out.println("=".repeat(50));
        System.out.println("Brand \t: " + phone.getBrand());
        System.out.println("Price \t: " + phone.getPrice());
        phone.move();

        System.out.println("=".repeat(50));
        System.out.println("                     INFO CAR                     ");
        System.out.println("=".repeat(50));
        System.out.println("Car's Total Forward Gear : " + mobil.getTotalForwardGear());
        System.out.println("Car's Color              : " + mobil.getColor());
        System.out.println("Car's Max Speed          : " + mobil.getMaxSpeed());
        mobil.move();
        
        System.out.println("=".repeat(50));
        System.out.println("                     INFO DOG                     ");
        System.out.println("=".repeat(50));
        dog.describe();
        System.out.println("Pitbull's Average Length  : " + dog.getAverageLength());
        System.out.println("Pitbull's Position now    : " + dog.getPosition());
        dog.move();
    }
}
