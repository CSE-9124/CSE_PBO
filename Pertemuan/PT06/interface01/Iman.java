package Pertemuan.PT06.interface01;

public class Iman implements Mahasiswa, Pegawai {
    
    String kampus, nama;
    double ipk;
    int gaji;

    @Override
    public boolean cekIPK(double ipk) {
        if (ipk > 3.00) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void cetakKampus(String kampus) {
        System.out.println("berasal dari kampus " + kampus);    
    }

    @Override
    public void cetakPegawai(String nama) {
        System.out.println("bekerja di perusahaan " + nama);        
    }

    @Override
    public void checkGaji(int gaji) {
        if (gaji > 3000000) {
            System.out.println("gaji di atas UMP");
        } else {
            System.out.println("gaji di bawah UMP");
        }
    }

    public static void main(String[] args) {
        Iman obj = new Iman();
        obj.gaji = 3500000;
        obj.ipk = 2.99;
        obj.kampus = "Unhas";
        obj.nama = "Iman";
        obj.cekIPK(obj.ipk);
        obj.cetakPegawai("Hero");
        obj.cetakJurusan("Matematika");
    }
    
}
