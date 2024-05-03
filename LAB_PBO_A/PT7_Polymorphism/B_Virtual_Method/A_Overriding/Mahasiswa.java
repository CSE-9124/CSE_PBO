package LAB_PBO_A.PT7_Polymorphism.B_Virtual_Method.A_Overriding;

public class Mahasiswa extends Manusia{

    @Override
    void makan() {
        System.out.println("Mahasiswa makan");
    }

    @Override
    void tidur() {
        System.out.println("Mahasiswa tidur");
    }

    @Override
    void bergerak() {
        System.out.println("Mahasiswa bergerak");
    }
}
