package Latihan.Pattern;

import java.util.Scanner;

public class Inverted_Triangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int r = sc.nextInt();

        System.out.println();

        for (int i = r; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        sc.close();
    }
}
