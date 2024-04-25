package Pertemuan.PT07;

public class WrapperClass {

    public static void main(String[] args) {
        int a = 8;
        Integer A = a;

        System.out.println(A);
        System.out.println(Integer.toString(a, 2));
        System.out.println(Integer.toBinaryString(a));

        double ipk = 3.27;
        Double IPK = ipk;
        System.out.println(IPK.intValue());
    }
    
}
