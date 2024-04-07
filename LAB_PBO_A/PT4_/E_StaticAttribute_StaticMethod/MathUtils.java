package LAB_PBO_A.PT4_.E_StaticAttribute_StaticMethod;

/* Static attribut/method dapat diakses dan dimodifikasi tanpa
membuat instance baru dari kelas tersebut */

public class MathUtils {
    // PI digunakan sebagai konstanta untuk nilai
    private static final double PI = 3.14159265358979323846;

    // Constructor private untuk mencegah instansiasi kelas ini
    private MathUtils() {}

    // Method untuk menghitung luas lingkaran berdasarkan jari-jari
    public static double calcCircleArea(double r) {
        return PI * r * r;
    }

    // Method untuk menghitung luas persegi panjang berdasarkan panjang dan lebar
    public static double calcCircleArea(double l, double w) {
        return l * w;
    }
}
