package LAB_PBO_A.PT8_Thread.B_Membuat_Thread.B_Mengimplementasikan;

/* Langkah-langkah membuat thread dengan cara ini:
 * - Buat sebuah kelas baru yang mengimplementasikan interface Runnable
 * - Override method run() untuk menentukan kode program yang akan dieksekusi oleh thread
 * - Buat sebuah objek dari kelas tersebut dan lewatkan objek tersebut ke dalam konstruktor kelas Thread
 * - Panggil method start() pada objek thread untuk memulai thread
*/

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from MyRunnable!");
    }
    
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
