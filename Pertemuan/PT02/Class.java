package Pertemuan.PT02;

class Class {

    public static void main(String[] args) {
        // Buat Objek
        Mahasiswa cholyn = new Mahasiswa();
        cholyn.nama = "Cholyn";
        cholyn.nim = "H071231040";
        cholyn.kampus = "Universitas Hasanuddin";
        cholyn.ipk = 3.45;

        cholyn.sayHi();
        System.out.println(cholyn.cekIPK());
        
        Mahasiswa rudy = new Mahasiswa();
        rudy.nama = "Rudy";
        rudy.nim = "H071231015";
        rudy.kampus = "Universitas Hasanuddin";
        rudy.ipk = 3.5;

        rudy.sayHi();
        System.out.println(rudy.cekIPK());

        Mahasiswa wandi = new Mahasiswa();
        wandi.nama = "Wandi";
        wandi.nim = "H071231008";
        wandi.kampus = "Universitas Hasanuddin";
        wandi.ipk = 3.6;

        wandi.sayHi();
        System.out.println(wandi.cekIPK());
    }
}

// Buat Class
/*
class Mahasiswa {
    String nim;
    String nama;
    double ipk;

    // Method
    void sayHi() {
        System.out.println("Hi " + nama);
    }

    String cekIPK() {
        if (ipk > 3){
            return "Baik";
        } else {
            return "Cukup";
        }
    }
} */