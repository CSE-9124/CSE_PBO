package LAB_PBO_A.PT1_Dasar_Pemrograman_Java;

class D_Tipe_Variabel_Operator {
    
    // 1. Tipe Data & Variabel
    char Karakter = 'Z';
    int bilBulat = 10;
    float bilDesimalkecil = 3.2f;
    double bilDesimalbesar = 13.12d;
    String Teks = "Hello SISFO";
    boolean Benar = true;
    
    public static void main(String[] args) {
    // 2. Operator
        // Aritmatika
            int Angka = 5;
            ++Angka; // peningkatan  nilai sebesar 1 poin                
            System.out.println(Angka);
            --Angka; // pengurangan  nilai sebesar 1 poin
            System.out.println(Angka);
                
        // Assignment (ditandai dengan simbol "=")
            Angka += 5;
            System.out.println(Angka);
            Angka *= 5;
            System.out.println(Angka);

        // Ternary (seperti shorthand conditional statement)
            String status = Angka > 90 ? "Lulus" : "Tidak Lulus";
            System.out.println(status);
    }
}
