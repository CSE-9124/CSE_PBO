package Pertemuan.PT04.inheritance;

public class Kendaraan {
    
    String warna;
    String merek;


    void cetak() {
        System.out.println("Kendaraan dengan warna " + this.warna);
    }

    void cetak(String warna) {
        System.out.println("Kendaraan dengan warna " + warna);
    }

}
