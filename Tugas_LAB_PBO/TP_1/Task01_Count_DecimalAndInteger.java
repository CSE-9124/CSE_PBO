package Tugas_LAB_PBO.TP_1;

import java.util.Scanner;

public class Task01_Count_DecimalAndInteger {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        try {
            int n = input.nextInt();
    
            int banyak_Bulat = 0;
            int banyak_Decimal = 0;
    
            for (int i = 0; i < n; i++) {
                try {
                    double bilangan = input.nextDouble();

                    if (bilangan % 1 == 0) {
                        banyak_Bulat++;
                    }
                    else {
                        banyak_Decimal++;
                    }

                } catch (Exception e) {
                    System.out.println("Inputan Harus Angka");
                    break;
                }
            }

            System.out.println("\n" + banyak_Bulat + " Bilangan Bulat");
            System.out.println(banyak_Decimal + " Bilangan Desimal");
            
            input.close();

        } catch (Exception e) {
            System.out.println("Inputan Harus Angka");
        }
    }
}
