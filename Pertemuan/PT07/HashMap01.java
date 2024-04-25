package Pertemuan.PT07;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {
        // provinsi(nama, ibukota)
        HashMap<String, String> provinsi = new HashMap<>();
        provinsi.put("Jabar", "Bandung");
        provinsi.put("Jatim", "Surabaya");
        provinsi.put("Sulsel", "Makassar");
        provinsi.put("Sultra", "Kendari");

        System.out.println("Ibukota Jawa Barat = " + provinsi.get("Jabar"));

        //cetak key beserta value
        System.out.println(provinsi);
        //cetak value saja
        System.out.println(provinsi.values());
        //cetak key saja
        System.out.println(provinsi.keySet());
    }
    
}