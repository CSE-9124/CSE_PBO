package LAB_PBO_A.PT7_Polymorphism.B_Virtual_Method.A_Overriding;

public class Test {
    public static void main(String[] args) {
        Manusia [] manusia = new Manusia[4];
        manusia[0] = new Mahasiswa();
        manusia[1] = new Asisten();
        manusia[2] = new Programmer();
        manusia[3] = new Manusia();

        for (int i = 0; i < manusia.length; i++) {
            manusia[i].makan();
            manusia[i].tidur();
            manusia[i].bergerak();
            System.out.println();
        }
    }
}
