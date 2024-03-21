package Pertemuan.PT04.inheritance;

public class Mobil extends Kendaraan {
    
    int jumRoda;
    int kapasitas;

    public static void main(String[] args) {
        // Kendaraan suv = new Kendaraan();
        Mobil suv = new Mobil();
        suv.merek = "Avanza";
        suv.warna = "Hitam";
        suv.jumRoda = 4;
        suv.cetak();
    }

    @Override
    void cetak(){ 
        System.out.println("Mobil " + this.merek + "berwarna " + this.warna);
    }

    void kapasitas() {
        System.out.println("Kendaraan ini berkapasitas " + this.kapasitas);
    }
}
