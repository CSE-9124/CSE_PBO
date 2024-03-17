package Tugas_LAB_PBO.TP_1;

import java.util.Scanner;

public class Task04_Hitung_LuasLingkaran {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
    
        try {
            System.out.print("r = ");
            double r = input.nextDouble();
            final double pi = 3.14159d;
            
            double luas = pi * r * r;
    
            String hasil = String.format("Hasil : %.2f", luas);
            System.out.println(hasil);
    
            input.close();
            
        } catch (Exception e) {
            System.out.println("Inputan Harus Angka");
        }
    }
}
