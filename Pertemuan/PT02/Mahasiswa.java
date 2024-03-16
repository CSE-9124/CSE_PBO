package Pertemuan.PT02;

public class Mahasiswa {
    String nim;
    String nama;
    String kampus;
    double ipk;

    // Method
    void sayHi() {
        System.out.println("Hi, saya " + nama + " dari kampus " + kampus + " dengan NIM " + nim);
    }

    String cekIPK() {
        if (ipk > 3){
            return "Baik";
        } else if (ipk > 2 && ipk < 3) {
            return "cukup";
        } else {
            return "Kurang";
        }
    }
}
