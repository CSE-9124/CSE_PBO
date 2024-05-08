package LAB_PBO_A.PT8_Thread.Study_Case;

import java.util.Scanner;

public class MyThread extends Thread{
    static long myTotal = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of threads: ");
        int t = sc.nextInt();

        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                while (System.currentTimeMillis()-startTime <= t) {
                    myTotal += 1;
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread threadB = new Thread(new Runnable() {

            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                while (System.currentTimeMillis()-startTime <= t) {
                    System.out.println(myTotal);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        threadA.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadB.start();

        sc.close();
    }
}
