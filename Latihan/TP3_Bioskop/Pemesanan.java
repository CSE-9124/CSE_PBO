package Latihan.TP3_Bioskop;

public class Pemesanan {
    // Attribute
    private String namaPemesan;
    private int jumlahTiket;
    private Bioskop bioskopTujuan;

    // Constructor dengan parameter
    public Pemesanan(String namaPemesan, int jumlahTiket, Bioskop bioskopTujuan) {
        this.namaPemesan = namaPemesan;
        this.jumlahTiket = jumlahTiket;
        this.bioskopTujuan = bioskopTujuan;
    }

    // Getter dan Setter
    public String getNamaPemesan() {
        return namaPemesan;
    }

    public void setNamaPemesan(String namaPemesan) {
        this.namaPemesan = namaPemesan;
    }

    public int getJumlahTiket() {
        return jumlahTiket;
    }

    public void setJumlahTiket(int jumlahTiket) {
        this.jumlahTiket = jumlahTiket;
    }

    public Bioskop getBioskopTujuan() {
        return bioskopTujuan;
    }

    public void setBioskopTujuan(Bioskop bioskopTujuan) {
        this.bioskopTujuan = bioskopTujuan;
    }

    // Method untuk menampilkan informasi pemesanan
    public void watchTo(String judulFilm) {

        boolean filmDitemukan = false;
            
        // Iterasi daftar film di bioskop tujuan untuk mencari film dengan judul yang sesuai
        for (Film film : bioskopTujuan.daftarFilm) {
            if (film.getJudul().equalsIgnoreCase(judulFilm)) {
                filmDitemukan = true;
                System.out.println(getNamaPemesan() + " Membeli tiket film " + film.getJudul() + " di bioskop " + bioskopTujuan.getNamaBioskop() + " " + bioskopTujuan.getLokasi() + " sebanyak " + getJumlahTiket() + " tiket");
                System.out.println("==============================================");

                System.out.println("Informasi Pemesanan:");
                System.out.println("Nama Pemesan          : " + namaPemesan);
                System.out.println("Judul  Film           : " + film.getJudul());
                System.out.println("Jumlah Tiket          : " + jumlahTiket);
                System.out.println("Bioskop Tujuan        : " + bioskopTujuan.getNamaBioskop());
                System.out.println("Lokasi Bioskop Tujuan : " + bioskopTujuan.getLokasi());
                
                // Kurangi jumlah kursi yang tersedia di bioskop
                int kursiTersediaSekarang = bioskopTujuan.getJumlahKursiTersedia() - jumlahTiket;
                bioskopTujuan.setJumlahKursiTersedia(kursiTersediaSekarang);
                System.out.println("Jumlah Kursi Tersedia : " + kursiTersediaSekarang);
                break; // Keluar dari loop setelah menemukan film
            }
        }
    
        if (!filmDitemukan) {
            System.out.println("Film dengan judul '" + judulFilm + "' tidak ditemukan di bioskop " + bioskopTujuan.getNamaBioskop() + " " + bioskopTujuan.getLokasi());
        }
    }
}
