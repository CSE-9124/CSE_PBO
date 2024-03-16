package Latihan.Pattern;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int rows = sc.nextInt(), k = 0;

        System.out.println();

        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }

        sc.close();
    }
}
