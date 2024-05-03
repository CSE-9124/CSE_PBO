package LAB_PBO_A.PT7_Polymorphism.B_Virtual_Method.B_OverLoading;

public class Test {
    public static void main(String[] args) {
        Pattern d1 = new Pattern();
    
        // call method without any argument
        d1.display();
        System.out.println("\n");
    
        // call method with a single argument
        d1.display('#');
    }
}
