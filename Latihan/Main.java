package Latihan;

public class Main {
    // Blok Utama
    public static void main(String[] args) {
        /* The code below will print the words Hello World
        to the screen, and the others */
        
        // Print Text
        System.out.println("Hello World");
        System.out.println("I'm Learning Java");
        System.out.println("It is awesome!");
        
        // Print Number
        System.out.println(40 + 10);
        System.out.println(100);

        // Variables
        String namaDepan = "Cholyn ";
        String namaBelakang = "Enos";
        String namaLengkap = namaDepan + namaBelakang;
        System.out.println("Hello " + namaLengkap);
        
        int angka = 30;
        angka = 20;
        System.out.println(angka);
        
        float Floatangka = 5.99f;
        char huruf = 'C';
        boolean betul = true;
        
        System.out.println(Floatangka);
        System.out.println(huruf);
        System.out.println(betul);

        // Multi Variables
        int p = 5, q = 5, r = 50;
        System.out.println(p + q + r);

        int x, y, z;
        x = y = z = 50;
        System.out.println(x + y + z);

        // Scientific Numbers
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);
    }
}

/*The general rules for naming variables are:
    Names can contain letters, digits, underscores, and dollar signs
    Names must begin with a letter
    Names should start with a lowercase letter, and cannot contain whitespace
    Names can also begin with $ and _ (but we will not use it in this tutorial)
    Names are case-sensitive ("myVar" and "myvar" are different variables)
    Reserved words (like Java keywords, such as int or boolean) cannot be used as names */