package LAB_PBO_A.PT4_.B_Access_Modifier.C_Protected;

// 2. Protected
/*acces modifier yang memungkinkan variabel, method, atau kelas dapat
diakses dari dalam kelas itu sendiri, subclass serta pda package yang sama*/

// Kelas Induk (superclass)
class Kendaraan {

    // Variable instance protected
    protected String merek;

    // Constructor
    public Kendaraan(String merek) {
        this.merek = merek;
    }

    // Method protected
    protected void bergerak() {
        System.out.println("Kendaraan bergerak.");
    }
}

// Kelas Turunan (subclass)
class Mobil extends Kendaraan {

    // Constructor
    public Mobil(String merek) {
        // Memanggil Contructor superclass dengan menggunakan kata kunci super
        super(merek);
    }

    // Method public yang memanggil method protected dari superclass
    public void jalankan() {
        // Memanggil method protected dari superclass
        bergerak();
        System.out.println("Mobil merek " + merek + " mulai berjalan.");
    }
}

public class MainC {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil mobil1 = new Mobil("Toyota");

        // Memanggil method public dari objek Mobil
        mobil1.jalankan();
    }
}
