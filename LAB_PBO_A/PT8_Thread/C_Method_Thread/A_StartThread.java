package LAB_PBO_A.PT8_Thread.C_Method_Thread;

/* Method start() akan menjalankan thread secara 
 * bersamaan dengan thread utama dan mengeksekusi
 * method run() */

class SampleThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from MyThread");
    }
    
}

public class A_StartThread {
    public static void main(String[] args) {
        SampleThread thread = new SampleThread();
        thread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/* Ada beberapa method yg sering digunakan:
 * - run() : method yang digunakan untuk menjalankan kode program
 *           pada thread
 * - sleep(long milis) : method yang digunakan untuk memperlambat atau memberi jeda
 *                       thread saat berjalan selama milidetik.
 * - join() : method yang digunakan untuk menunggu hingga thread 
 *            yang ditunjukkan oleh objek thread selesai dieksekusi
 *            sebelum melanjutkan eksekusi program pada thread yang
 *            sedang berjalan
*/
