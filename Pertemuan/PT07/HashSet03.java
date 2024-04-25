package Pertemuan.PT07;

import java.util.HashSet;

public class HashSet03 {
    public static void main(String[] args) {
        HashSet<Integer> A = new HashSet<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        System.out.println("Set A = " + A);

        HashSet<Integer> B = new HashSet<Integer>();
        B.add(3);
        B.add(4);
        B.add(5);
        B.add(6);
        System.out.println("Set B = " + B);

        //Irisan
        A.retainAll(B);
        System.out.println("Irisan A dan B = " + A);


    }
    
}
