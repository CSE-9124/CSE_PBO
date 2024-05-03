package LAB_PBO_A.PT7_Polymorphism.B_Virtual_Method.A_Overriding;

public class Asisten extends Manusia{
    @Override
    void makan() {
        System.out.println("Asisten makan");
    }

    @Override
    void tidur() {
        System.out.println("Asisten tidur");
    }

    @Override
    void bergerak() {
        System.out.println("Asisten bergerak");
    }
}
