package LAB_PBO_A.PT1_Dasar_Pemrograman_Java;

class I_String_Manipulation {

        // 1. Deklarasi String
            // String Literal
                String a = "sisfo";
            
            // String Objek
                String b = new String("sisfo");

    public static void main(String[] args) {

        System.out.println("2. String dan Array Of Char");
            String prodi = "Sistem Informasi";
            char[] prodiChar = prodi.toCharArray();     // Mengonversi string menjadi array karakter
            String prodiString = new String(prodiChar); // Membuat string baru dari array karakter

            System.out.print("Array karakter: ");
            for (char c : prodiChar) {
                System.out.print(c + "-");
            }
            System.out.println();

            System.out.println(prodiString);

        System.out.println("3. String Format");
            // String.format()
                String result = String.format("%.2f", 3.12412);  // Mengatur Presisi Desimal (berapa angka dibelakang koma)
                System.out.println(result);
                
                String formatted = String.format("Tggl: %02d", 9);  // Menambahkan nol di depan jika panjang string kurang dari 2
                System.out.println(formatted);

            // printf()
                System.out.printf("%14s", "Sembilan");  // Menambahkan Karakter Spasi (membuat panjang string 14)

                System.out.println();

                System.out.printf("Quotes: %n%27s", "Aku percaya Mujizat"); // Memberikan New Line (seperti fungsi "/n" pd Python)

                System.out.printf("%nInisial: %c", 'C');

        System.out.println("4. Reference Equality dan Value Equality pada String");
            String a = "sisfo";
            String b = new String("sisfo");
            String c = "sisfo";

            System.out.println(a.equals(b));
            System.out.println(a == b);
            System.out.println(a == c);
    }
}
