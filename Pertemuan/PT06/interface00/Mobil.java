package Pertemuan.PT06.interface00;

public class Mobil implements Kendaraan, Transportasi {

    String warna;
    String rute;

    @Override
    public void cetakJenis(String jenis) {
        System.out.println("mobil berjenis " + jenis + " berwarna " + warna);
    }

    @Override
    public void cetakRoda(int roda) {
        System.out.println("mobil beroda " + roda);
    }

    @Override
    public void cetakRute() {
        System.out.println("mobil rute " + rute);
    }
    
}
