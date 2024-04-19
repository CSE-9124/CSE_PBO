package LAB_PBO_A.PT4_Encapsulation.B_Access_Modifier.B_Default.TesB;

public class CarB {
    String brand;

    public CarB(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    void race() {
        System.out.println("Racing... (Brum brum :v)");
    }
}

// 2. Default Class
/* Class yang dideklarasikan dengan access modifier default hanya bisa
diakses oleh class-class yang ada dalam package yang sama dengan class tersebut */