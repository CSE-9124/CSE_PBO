package Pertemuan.PT05;

public class Pesawat extends Kendaraan {
    String jenis;

    Pesawat() {
        //
    }

    Pesawat(String nama) {
        super(nama);
        System.out.println("---- Ini Pesawat ----");
    }


    @Override
    void cetakJumRoda() {
        System.out.println("Pesawat beroda " + jumRoda);
    }

    void checkPesawat() {
        if (super.check()) {
            System.out.println("Pesawat Heli");   
        } else {
            System.out.println("Bukan Heli");
        }
    }

    @Override
    void cetakJenis() {
        System.out.println("Pesawat berjenis " + jenis);
        super.jenis = this.jenis;
        super.cetakJenis();
    }

}
