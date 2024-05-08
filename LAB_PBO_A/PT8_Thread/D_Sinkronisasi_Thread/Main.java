package LAB_PBO_A.PT8_Thread.D_Sinkronisasi_Thread;

/* Race condition :
 * Terjadi ketika ada beberapa thread yang bekerja pada kode
 * yang sama dan menggunakan variabel bersamaan.
*/

/* Deadlock :
 * Terjadi ketika terdapat dua atau lebih thread yang saling 
 * berkomunikasi dengan sumber daya yang sama dan kedua thread
 * lainnya secara bersamaan.
*/

class Koin {
    private int count = 0;

    public int getCount() {
        return count;
    }

    public synchronized void increment() {
        count++;
    } 
}

public class Main {
    public static void main(String[] args) {
        Koin koin = new Koin();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                koin.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                koin.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count: " + koin.getCount());
    }
}
