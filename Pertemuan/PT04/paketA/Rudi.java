package Pertemuan.PT04.paketA;

public class Rudi extends mahasiswa {
    public static void main(String[] args) {
        
        Rudi rudi = new Rudi();
        rudi.nama = "Rudi";
        rudi.nim = "H071238888";
        rudi.usia = 20;

        rudi.sayHello();
        rudi.cekIPK();
    }
}
