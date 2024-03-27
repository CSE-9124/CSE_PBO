package Pertemuan.PT06.interface01;

public class Ani extends Manusia implements Mahasiswa, Pegawai  {

    @Override
    public void cetakPegawai(String nama) {
        System.out.println("pegawai " + nama);
    }

    @Override
    public void checkGaji(int gaji) {
        System.out.println("gaji " + gaji);
    }

    @Override
    public void cetakKampus(String kampus) {
        System.out.println("berasal dari kampus " + kampus);
    }

    @Override
    public boolean cekIPK(double ipk) {
        return true;
    }

    public static void main(String[] args) {
        Ani ani = new Ani();
        ani.nama = "Ani";
        ani.beratBadan = 60;
        ani.tinggiBadan = 165;
        ani.warnaKulit = "sawo matang";
        ani.cetakKampus("Unhas");
    }
    
}
