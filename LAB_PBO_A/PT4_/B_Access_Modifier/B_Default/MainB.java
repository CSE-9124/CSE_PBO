package LAB_PBO_A.PT4_.B_Access_Modifier.B_Default;

// 2. Default Modifier
/* Access modifier yang tidak menggunakan kata kunci access modifier
dan hanya dapat diakses dari kelas yang berbeda dalam package yang sama */

import LAB_PBO_A.PT4_.B_Access_Modifier.B_Default.TesB.CarB;

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
