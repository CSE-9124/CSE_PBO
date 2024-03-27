package Pertemuan.PT05;

public class Motor extends Kendaraan {
    String pabrikan;
    
    void cetakMotor() {
        System.out.println("");
    }

    @Override
    void cetakJumRoda() {
        System.out.println("Motor beroda " + jumRoda + " dirakit pada tahun " + tahunPembuatan);
    }
   
}
