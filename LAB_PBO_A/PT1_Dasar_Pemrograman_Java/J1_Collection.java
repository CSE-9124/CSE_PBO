package LAB_PBO_A.PT1_Dasar_Pemrograman_Java;

import java.util.ArrayList;

class J1_Collection {
    
    public static void main(String[] args) {
        
        System.out.println("1. List");
            // Membuat Array List
                ArrayList<String> names = new ArrayList<>();

            // Menambah data kedalam Array List
                names.add("Rojali");
                names.add("Eko");

            // Mengakses Element ArrayList
                System.out.println(names.get(0));

            // Mendapatkan Panjang dari ArrayList
                System.out.println(names.size());

            // Menghapus Element ArrayList
                names.remove(0);
            
            // Menghapus semua Element di ArrayList
                names.clear();
    }
}
