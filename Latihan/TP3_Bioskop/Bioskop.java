package Latihan.TP3_Bioskop;

import java.util.ArrayList;

public class Bioskop {
    // Attribute
    private String namaBioskop;
    private String lokasi;
    private int jumlahKursiTersedia;

    ArrayList <Film> daftarFilm = new ArrayList<>();

    // Constructor tanpa parameter
    public Bioskop() {}

    // Constructor dengan parameter
    public Bioskop(String namaBioskop, String lokasi, int jumlahKursiTersedia) {
        this.namaBioskop = namaBioskop;
        this.lokasi = lokasi;
        this.jumlahKursiTersedia = jumlahKursiTersedia;
    }

    // Getter dan Setter
    public String getNamaBioskop() {
        return namaBioskop;
    }

    public void setNamaBioskop(String namaBioskop) {
        this.namaBioskop = namaBioskop;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public int getJumlahKursiTersedia() {
        return jumlahKursiTersedia;
    }

    public void setJumlahKursiTersedia(int jumlahKursiTersedia) {
        this.jumlahKursiTersedia = jumlahKursiTersedia;
    }

    // Behaviour 1: Menampilkan informasi tentang bioskop
    public void displayInfo() {
        System.out.println("==================== Informasi Bioskop " + getNamaBioskop() +  " ====================");
        System.out.println("Nama Bioskop           : " + getNamaBioskop());
        System.out.println("Lokasi                 : " + getLokasi());
        System.out.println("Jumlah Kursi Tersedia  : " + getJumlahKursiTersedia());
        for (Film film : daftarFilm) {
            System.out.println("\nJudul Film             : " + film.getJudul());
            System.out.println("Genre Film             : " + film.getGenre());
            System.out.println("Durasi Film            : " + film.getDurasi());
        }
    }

    // Behaviour 2: Melakukan penambahan Film
    public void tambahFilm(Film film) {
        daftarFilm.add(film);
        System.out.println(this.getNamaBioskop() + " Telah Menambahakan sebuah film " + film.genre + " berjudul " + film.getJudul());
    }
}
