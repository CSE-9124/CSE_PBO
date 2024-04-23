package LAB_PBO_A.PT5_Inheritance.Study_Case3;

public class Manajer extends Karyawan{
    String departemen;

    void display() {
        super.display();
        System.out.println("Departemen: " + departemen);
    }
}
