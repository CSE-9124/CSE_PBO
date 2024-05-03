package LAB_PBO_A.PT7_Polymorphism.B_Virtual_Method.A_Overriding;

public class Programmer extends Manusia{
    @Override
    void makan() {
        System.out.println("Programmer makan");
    }

    @Override
    void tidur() {
        System.out.println("Programmer tidur");
    }

    @Override
    void bergerak() {
        System.out.println("Programmer bergerak");
    }
}
