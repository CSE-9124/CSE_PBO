package LAB_PBO_A.PT1_Dasar_Pemrograman_Java;

import java.util.Scanner;

public class Study_Case {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukan Nama : ");
        String nama = sc.nextLine();
        System.out.print("Masukan Uang : ");
        int uang = sc.nextInt();

        if (nama.isEmpty() && uang <= 0 ) {
            System.out.println("Nama Harus diisi dan uang harus > 0");
        }
        else {
            System.out.println("\n MENU :");
            System.out.println("1. Nasi Goreng Seafood \t\t 15.000");
            System.out.println("2. Coto Makassar \t\t 20.000");
            System.out.println("3. Pallubasa Serigala \t\t 25.000");

            System.out.print("Masukan Pilihan Anda : ");
            int pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    if (uang == 15000) {
                        System.out.println("Terima Kasih");
                    } else {System.out.println("Uang Anda Kurang");}
                    break;
                case 2:
                    if (uang == 20000) {
                        System.out.println("Terima Kasih");
                    } else {System.out.println("Uang Anda Kurang");}
                    break;
                case 3:
                    if (uang == 25000) {
                        System.out.println("Terima Kasih");
                    } else {System.out.println("Uang Anda Kurang");}
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}
