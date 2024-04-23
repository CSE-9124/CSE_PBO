package LAB_PBO_A.PT5_Inheritance.Study_Case3;

public class Main {
    public static void main(String[] args) {
        Orang o = new Orang();
        o.nama = "Lala";
        o.usia = 29;

        o.display();
        System.out.println();

        Karyawan k = new Karyawan();
        k.nama = "Minul";
        k.usia = 28;
        k.gaji = 2000000.0;

        k.display();
        System.out.println();

        Manajer obj = new Manajer();
        obj.nama = "Vivi";
        obj.usia = 30;
        obj.gaji = 5000000.0;
        obj.departemen = "Sistem Informasi";

        obj.display();
        System.out.println();
    }
}
