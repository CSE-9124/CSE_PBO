package Pertemuan.PT04.paketA;

public class mahasiswaApp {
    
    public static void main(String[] args) {
        mahasiswa cholyn = new mahasiswa();
        cholyn.nama = "Cholyn";
        cholyn.usia = 20;
        cholyn.nim = "H071231040";
        
        cholyn.cekIPK();

        
        // prodi = "Sisfo";
        // sayHello("Iman");
        // mahasiswaApp obj = new mahasiswaApp();
        // obj.sayHello("Iman");
        // obj.prodi = "Sisfo";
    }

    void sayHello(String nama) {
        System.out.println("Hello " + nama);
    }

}
