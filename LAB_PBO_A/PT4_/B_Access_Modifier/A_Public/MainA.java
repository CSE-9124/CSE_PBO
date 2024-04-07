package LAB_PBO_A.PT4_.B_Access_Modifier.A_Public;

// 1. Public
/* Access modifier yang paling umum digunakan dan memungkinakan variabel, method,
atau kelas dapat diakses dari mana saja, baik dari dalam maupun dari luar kelas*/

public class MainA {
    public static void main(String[] args) {
        CarA car = new CarA("Lesux", 4);
        car.brand = "Toyato";
        System.out.println(car.brand);
    }
}
