package Latihan.TP3_Bioskop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Membuat objek bioskop A dengan 100 kursi tersedia
        System.out.println("==============================================");
        System.out.print("Masukkan Nama bioskop               : ");
        String namaBioskop = sc.nextLine();
        System.out.print("Masukkan lokasi bioskop             : ");
        String lokasi = sc.nextLine();
        System.out.print("Masukkan jumlah kursi yang tersedia : ");
        int jumlahKursiTersedia = sc.nextInt();
        sc.nextLine();

        Bioskop bioskopA = new Bioskop(namaBioskop, lokasi, jumlahKursiTersedia);
        
        System.out.println("==============================================");
        boolean tambahFilm = true;
        while (tambahFilm) {
            System.out.print("Masukkan judul film: ");
            String judul = sc.nextLine();
            
            System.out.print("Masukkan genre film: ");
            String genre = sc.nextLine();
            
            System.out.print("Masukkan durasi film (dalam menit): ");
            int durasi = sc.nextInt();
            sc.nextLine(); // Membersihkan newline di buffer

            // Membuat objek Film dan menambahkannya ke dalam daftarFilm
            Film filmBaru = new Film(judul, genre, durasi);
            bioskopA.tambahFilm(filmBaru);

            System.out.print("Ingin menambah film lagi? (ya/tidak): ");
            String jawaban = sc.nextLine();
            if (!jawaban.equalsIgnoreCase("ya")) {
                tambahFilm = false;
            }
        }

        bioskopA.displayInfo();
        System.out.println("==============================================");

        // Membuat objek pemesanan tiket
        System.out.print("Masukkan Nama Pemesan               : ");
        String namaPemesan = sc.nextLine();
        System.out.print("Masukkan Jumlah Tiket               : ");
        int jumlahTiket = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan Nama Film                  : ");
        String film = sc.nextLine();

        Pemesanan pemesanan1 = new Pemesanan(namaPemesan, jumlahTiket, bioskopA);
        
        pemesanan1.watchTo(film);

        sc.close();
    }
}
