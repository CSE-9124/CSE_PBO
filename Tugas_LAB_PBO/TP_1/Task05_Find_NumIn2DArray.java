package Tugas_LAB_PBO.TP_1;

import java.util.Scanner;

public class Task05_Find_NumIn2DArray {
    public static void main(String[] args) {

        int[][] nums = {{1,2,3}, {4,5,6}, {7,8,9}};

        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Input Angka yang mau dicari : ");
                int cariAngka = input.nextInt();
    
                for (int i = 0; i < nums.length; i++) {
                    for (int j = 0; j < nums[i].length; j++) {
                        int angka = nums[i][j];
    
                        if (angka == cariAngka) {
                            System.out.println("Found " + cariAngka + " at [" + i + "][" + j + "]");
                        }
                    }
                }
    
                break;
            } catch (Exception e) {
                System.out.println("Inputan Harus Angka");
                input.nextLine();
            }
        }

        input.close();
    }
}
