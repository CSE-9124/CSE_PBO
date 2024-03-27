package Pertemuan.PT06.interface01;

abstract class Manusia {
    String nama;
    int tinggiBadan;
    int beratBadan;
    String warnaKulit;

    void cetak() {
        System.out.println("Nama " + nama);
        System.out.println("Tinggi " + tinggiBadan + ", berat " + beratBadan);
    }
}