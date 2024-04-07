package LAB_PBO_A.PT4_.B_Access_Modifier.C_Protected;

public class CarC extends Vehicle {
    
    public void releaseTheClutch() {
        move();
        System.out.println("The car release the clutch...");
    }

    public static void main(String[] args) {
        CarC car = new CarC();
        car.move();
        System.out.println();
        car.releaseTheClutch();

    }
}
