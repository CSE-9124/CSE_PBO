package Pertemuan.PT04.inheritance;

public class Kendaraan {
    
    String warna;
    String merek;

    // Kendaraan(String merk) {
    //     System.out.println("Kendaraan merk " + this.merk);
    // }

    // Kendaraan() {
    //     //empty constructor
    // }

    void cetak() {
        System.out.println("Kendaraan dengan warna " + this.warna);
    }

    void cetak(String warna) {
        System.out.println("Kendaraan dengan warna " + warna);
    }

}
