package Pertemuan.PT05;

public class App {

    

    public static void main(String[] args) {
        Mobil ferari = new Mobil();
        ferari.jumRoda = 4;
        ferari.jenis = "Mobil Sport";
        ferari.tahunPembuatan = 2021;
        ferari.ukuranCC = 5000;
        ferari.warna = "Kuning";

        ferari.cetakJumRoda();
        ferari.cetakMobil();

        Motor yamaha = new Motor();
        yamaha.pabrikan = "Jepang";
        yamaha.jenis = "Motor";
        yamaha.jumRoda = 2;
        yamaha.tahunPembuatan = 2021;
    
        yamaha.cetakMotor();
        yamaha.cetakJumRoda();


        Kendaraan honda = new Motor();
        honda.jenis = "Motor";


        Pesawat heli = new Pesawat("heli");
        heli.jumRoda = 5;
        heli.jenis = "Heli";
        heli.cetakJenis();
    }
}
