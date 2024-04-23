package LAB_PBO_A.PT5_Inheritance.A_Inheritance;

/* Inheritance merupakan suatu bentuk hubungan atau pewarisan untuk
 * menghubungkan class atau objek dengan class yang lain.
 * Konsep ini seperti hubungan keluarga antara orang tua dan anak
*/

/* Konsep pewarisan dikelompokan menjadi dua kategori:
 * - subclass (child)
 * - superclass (parents)
*/

public class Main {
    public static void main(String[] args) {
        // namaClass namaVariable = new namaClass();
        // hati-hati case sensitive!
        Enemy monster = new Enemy();

        Zombie zumbi = new Zombie();

        Pocong hantuPocong = new Pocong();

        Burung garuda = new Burung();

        // output: Burung Terbang...
        garuda.fly();
        // output: Serang!
        zumbi.attack();
        garuda.attack();
        hantuPocong.attack();
        // output: Serang!
        monster.attack();
    }
}

/* Penggunakan konsep inheritance dalam programing dapat 
 * mempermudah kita dari pembuatan kode yang berulang-ulang atau sama
 */