package Pertemuan.PT07;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {
        HashSet<Integer> data = new HashSet<Integer>();
        data.add(3);
        data.add(5);
        data.add(8);
        System.out.println(data); // -> [3, 5, 8]
        data.add(3);
        //3 tidak ditambahkan lagi ke set karena sudah ada sebelumnya
        System.out.println(data); // -> [3, 5, 8]

    }
    
}
