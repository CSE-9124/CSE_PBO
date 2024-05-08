package LAB_PBO_A.PT8_Thread.B_Membuat_Thread.A_Mengextend;

/* Langkah-langkah membuat thread dengan cara ini:
 * - Buat sebuah kelas baru yang meng-extend kelas Thread
 * - Override method run() untuk menentukan kode program yang akan dieksekusi oleh thread
 * - Buat sebuah objek dari kelas tersebut dan panggil method start() untuk memulai thread
*/

public class MyThread extends Thread{
    public void run() {
        System.out.println("Hello from MyThread!");
    }

    public void info() {
        System.out.println("Info");
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
