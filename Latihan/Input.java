package Latihan;

import java.util.Scanner;

class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        System.out.print("Masukkan Nama : ");
        nama = input.next();
        System.out.println("Hello " + nama);
        
        // Luas Lingkaran
        float r, luas;
        System.out.print("Input jari-jari = ");
        r = input.nextFloat();
        luas = 3.1415f * r * r ;
        System.out.println("Luas = " + luas);

        //
        int n;
        System.out.print("n = ");
        n = input.nextInt();
        for (int i = 2; i <= n; i++){
            System.out.println(2*i + " " );
        }
        

        double a = input.nextDouble();
        System.out.println(a % 1);
        System.out.println(a % 1 == 0);

        input.close();
    }
}
