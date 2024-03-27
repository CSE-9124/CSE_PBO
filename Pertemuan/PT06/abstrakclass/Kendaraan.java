package Pertemuan.PT06.abstrakclass;

abstract class Kendaraan {
    
    String jenis;
    int jumRoda;
    int tahunPembuatan;

   void cetakJenis() {
        System.out.println("kendaraan berjenis " + jenis);
    }

    abstract void cetakRoda();

}
