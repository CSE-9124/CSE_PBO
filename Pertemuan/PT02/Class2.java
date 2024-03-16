package Pertemuan.PT02;

public class Class2 {

    static String nama;
    public static void main(String[] args) {
        
        Class2 obj = new Class2();
        obj.sayHi(nama);

    }

    void sayHi(String nama) {
        System.out.println("Hi" + nama);
    }
}
