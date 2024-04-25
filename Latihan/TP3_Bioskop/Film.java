package Latihan.TP3_Bioskop;

public class Film {
    String judul, genre;
    double durasi;
    
    public Film() {}

    public Film(String judul, String genre, double durasi) {
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
    }

    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public double getDurasi() {
        return durasi;
    }
    public void setDurasi(double durasi) {
        this.durasi = durasi;
    }  
}
