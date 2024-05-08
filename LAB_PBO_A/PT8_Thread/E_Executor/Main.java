package LAB_PBO_A.PT8_Thread.E_Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* Executor merupakan sebuah mekanisme untuk menjalankan sebuah tugas secara asynchronous*/

public class Main {
    public static void main(String[] args) {
        // membuat executor dengan fixed thread pool
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // menjalankan tiga tugas secara bersamaan
        for (int i = 0; i < 3; i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Tugas sedang dijalankan oleh thread: "
                            + Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Tugas selesai dijalankan oleh thread: "
                            + Thread.currentThread().getName());
                }
            });
        }

        // menutup executor setelah selesai menjalankan tugas
        executor.shutdown();
    }
}

/* Pada contoh diatas, digunakan ExecutorService dengan 
 * newFixedThreadPool(3) untuk membuat
*/
