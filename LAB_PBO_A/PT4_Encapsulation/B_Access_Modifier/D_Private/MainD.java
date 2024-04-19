package LAB_PBO_A.PT4_Encapsulation.B_Access_Modifier.D_Private;

// 4. Private
/* Access modifier yang membatasi aksebilitas variabel, method,
atau kelas hanya pada kelas itu sendiri */

final class ContohPrivate {
    // Variabel Private
    private int angkaPrivate;

    public ContohPrivate(int newangkaPrivate){
        this.angkaPrivate = newangkaPrivate;
    }

    private void metodePrivate() {
        System.out.println("Ini adalah " + angkaPrivate + " dan metode private yang hanya dapat diakses dari dalam kelas ContohPrivate");
    }

    public void panggilMetodePrivate() {
        // Memanggil metode private dari dalam kelas ContohPrivate
        metodePrivate();
    }
}

public class MainD {
    public static void main(String[] args) {
        // Membuat objek dari kelas ContohPrivate
        ContohPrivate contoh = new ContohPrivate(10);

        // Mencoba mengakses method private (tidak bisa dilakukan dari luar kelas ContohPrivate)
        // contoh.metodePrivate(); // Ini akan menyebabkan error

        // Memanggil method public yang memanggil method private
        contoh.panggilMetodePrivate();
    }
}
