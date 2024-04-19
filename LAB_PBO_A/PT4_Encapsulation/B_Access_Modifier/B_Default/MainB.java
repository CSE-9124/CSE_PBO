package LAB_PBO_A.PT4_Encapsulation.B_Access_Modifier.B_Default;

import LAB_PBO_A.PT4_Encapsulation.B_Access_Modifier.B_Default.TesB.CarB;

class Kendaraan {
    String merek;
    
    Kendaraan(String merek) {
        this.merek = merek;
    }

    void bergerak() {
        System.out.println("Kendaraan bergerak.");
    }
    /* Jika kita ingin method bergerak() diakses dari luar package,
    maka kita harus mengimport class kendaraan */
}

public class MainB {
    public static void main(String[] args) {
        Kendaraan motor = new Kendaraan("Honda");
    
        motor.bergerak();
        
        CarB car = new CarB("Lesux");
        // car.brand = "Totoya"; // Error karena brand bersifat default dan tidak bisa diakses dari luar package
        System.out.println(car.getBrand());
    }
}
