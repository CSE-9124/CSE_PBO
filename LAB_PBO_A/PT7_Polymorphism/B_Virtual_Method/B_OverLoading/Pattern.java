package LAB_PBO_A.PT7_Polymorphism.B_Virtual_Method.B_OverLoading;

public class Pattern {

    // method without parameter
    public void display() {
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
    }

    // method with single parameter
    public void display(char symbol) {
        for (int i = 0; i < 10; i++) {
        System.out.print(symbol);
        }
    }
}
