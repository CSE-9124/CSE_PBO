package LAB_PBO_A.PT4_Encapsulation.B_Access_Modifier.A_Public;

public class CarA {
    public String brand;
    public int countOfWheels;    
    
    public CarA(String brand, int countOfWheels) {
        this.brand = brand;
        this.countOfWheels = countOfWheels;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public int getCountOfWheels() {
        return countOfWheels;
    }
}

// 1. Public Class
/* Class yang dideklarasikan dengan public bisa dipakai oleh semua
class yang ada dalam project, bahkan bisa dipakai oleh project lain*/