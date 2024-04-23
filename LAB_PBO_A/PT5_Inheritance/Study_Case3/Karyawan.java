package LAB_PBO_A.PT5_Inheritance.Study_Case3;

public class Karyawan extends Orang{
    double gaji;

    void display() {
        super.display();
        System.out.println("Gaji \t: " + gaji);
    }
}
