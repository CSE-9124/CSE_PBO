package Pertemuan.PT05;

public class Mobil extends Kendaraan {
    String warna;
    int ukuranCC;

    void cetakMobil() {
        System.out.println("Mobil berwarna " + warna + " beroda " + jumRoda);
    }

    @Override
    void cetakJumRoda() {
        System.out.println();
    }

}
