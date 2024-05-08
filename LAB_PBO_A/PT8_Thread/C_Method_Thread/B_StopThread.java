package LAB_PBO_A.PT8_Thread.C_Method_Thread;

/* Untuk menghentikan thread yg sedang berjalan, kita dapat menggunakan
 * method stop(), namun itu tidak direkomendasikan karena dapat menyebabkan
 * kesalahan pada data, sebaiknya menggunakan flag boolean untuk memberikan 
 * tanda pada thread untuk berhenti tanpa ada erorr.
 */

class TestThread extends Thread {
    private boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("Hello from MyThread");
        }
    }

    public void stopThread() {
        running = false; // memberikan tanda untuk menghentikan thread
    }
}

public class B_StopThread {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();
        
        // berhenti setelah 5 detik
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.stopThread();
    }
}
