package Pertemuan.PT05;

public class Kendaraan {
    String jenis;
    int jumRoda;
    int tahunPembuatan;


    // Constructor
    Kendaraan() {
        System.out.println("---- Ini Kendaraan ----");
    }

    Kendaraan(String jenis) {
        this.jenis = jenis;
        System.out.println("---- CHECK ----" + this.jenis);
    }


    void cetakJenis() {
        System.out.println("kendaraan berjenis " + jenis);
    }

    void cetakJumRoda() {
        System.out.println("Kendaraan beroda " + jumRoda);
    }

    boolean check() {
        if (jenis == "Pesawat") {
            return true;
        } else {
            return false;
        }
    }
}
