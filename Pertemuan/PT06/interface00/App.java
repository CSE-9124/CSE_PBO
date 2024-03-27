package Pertemuan.PT06.interface00;

public class App {

    public static void main(String[] args) {
        Mobil petepete = new Mobil();
        petepete.warna = "biru";
        petepete.rute = "unhas -> sma 5";
        petepete.cetakRoda(2);
        petepete.cetakRute();
    }
    
}
