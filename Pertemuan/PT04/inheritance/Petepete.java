package Pertemuan.PT04.inheritance;

public class Petepete extends Mobil {
    public static void main(String[] args) {
        
        Petepete kosong5 = new Petepete();
        kosong5.merek = "Suzuki Carry";
        kosong5.warna = "Biru";
        kosong5.jumRoda = 4;
        kosong5.kapasitas = 10;

        kosong5.cetak();
        kosong5.kapasitas();
    }
}
