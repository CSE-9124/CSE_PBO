package Pertemuan.PT07;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {

        ArrayList<String> nama = new ArrayList<String>();
        nama.add("iman");
        nama.add("ani");
        System.out.println(nama.toString());


        System.out.println();
        ArrayList<Integer> nilai = new ArrayList<Integer>();
        nilai.add(100);
        nilai.add(20);
        System.out.println(nilai);
        System.out.println(nilai.contains(30));

        
    }
    
}
