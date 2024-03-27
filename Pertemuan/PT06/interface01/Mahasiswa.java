package Pertemuan.PT06.interface01;

interface Mahasiswa {
    
    void cetakKampus(String kampus);

    boolean cekIPK(double ipk);

    default void cetakJurusan(String jurusan) {
        System.out.println("Kuliah Jurursan " + jurusan);
    }
}
