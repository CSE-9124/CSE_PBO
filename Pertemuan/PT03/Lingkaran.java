package Pertemuan.PT03;

public class Lingkaran {
    
    double r;
    final double PI = 3.1415;

    Lingkaran(double r) {
        this.r = r;
    }

    double luas() {
        return PI * r * r;
    }

    double keliling() {
        return  2 * PI * r;
    }

}
