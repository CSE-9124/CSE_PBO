package LAB_PBO_A.PT1_Dasar_Pemrograman_Java;

import java.util.HashMap;

class J3_Collection {
    
    public static void main(String[] args) {
        
        System.out.println("3. Map");
            // Membuat HashMap <key, value>
                HashMap<String, Integer> scores = new HashMap<>();

            // Menambah Data
                scores.put("Abdul", 87);
                scores.put("Yoyo", 89);
            
            // Mengakses Element
                System.out.println(scores.get("Abdul"));

            // Menghapus Element
                scores.remove("Yoyo");

            // Merubah Nilai
                scores.replace("Abdul", 89);
    }
}
