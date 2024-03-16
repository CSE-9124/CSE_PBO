package LAB_PBO_A.PT1_Dasar_Pemrograman_Java;

import java.util.Scanner;

class F_Looping {
    public static void main(String[] args) {
        
        System.out.println("1. For Loop");      // 1. For Loop
            for (int i = 0; i < 10; i++) {
                System.out.println("Iterasi Ke-" + i);
            }

        System.out.println("2. While Loop");    // 2. While Loop 
            Scanner in = new Scanner(System.in);
            int answer = 9;
            boolean guess = false;

            while (!guess) {
                int tryAnswer = in.nextInt();
                guess = tryAnswer == answer;
            }
            System.out.println("End");
            in.close();

        System.out.println("3. Do While Loop"); // 3. Do While Loop
            int n = 10;
            do {
                System.out.println(n);
                n++;
            } while (n < 10);
            System.out.println("End");
    }    
}
