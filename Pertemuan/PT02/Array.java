package Pertemuan.PT02;

public class Array {
    
    public static void main(String[] args) {
        String[] mobil = {"Nissan", "Mercedes", "Toyota"};
        System.out.println(mobil[0]);


        int[] bilangan = new int[5];
        bilangan[4] = 106;
        bilangan[2] = 0;

        // Array Dua Dimensi
        int[][] data = { {3,2,1}, {4,5}, {0}};
        System.out.println(data[0][2]);
        System.out.println(data[2][0]);

        double[][] matriks = new double[3][2];
        System.out.println(matriks);
    }
}
