package LAB_PBO_A.PT1_Dasar_Pemrograman_Java;

class G_Array {
    
        // 1. Deklarasi Array
            // 1. tipeData[] namaVariabel;
                int[] arrayOfInt;

            // 2. tipeData namaVariabel[];
                char arrayOfChar[];
            
            // 3. tipeData[] namaVariabel = new tipeData[n];
                double[] arrayOfDouble = new double[10];
            
            // 4. tipeData namaVariabel[] = new tipeData[n];
                double arrayOfdouble[] = new double[10];

    public static void main(String[] args) {

        // 2. Inisialisasi Array
            // Cara Pertama
                @SuppressWarnings("unused")
                int[] arrayOfInt = new int[]{1, 2, 3};

            // Cara Kedua
                char[] arrayOfChar = new char[4];
                arrayOfChar[0] = 'h';
                arrayOfChar[1] = 'a';
                arrayOfChar[2] = 'l';
                arrayOfChar[3] = 'o';

            // Cara Ketiga
                @SuppressWarnings("unused")
                float[] arrayOfFloat = {1f, 2f, 3f};

        // 3. Mengakses Elemen Array
            int[] arr = {0, 4, 9};
            int n = arr[2];
            System.out.println(n);

        // 4. Mengakses array dengan For Each
        System.out.println("4. Mengakses array dengan For Each");
            int[] numbers = {1, 5, 2};
            // dengan perulangan biasa
                for (int i = 0; i < numbers.length; i++) {
                    System.out.println(numbers[i]);
                }

            // menggunakan for each
                for (int number : numbers) {
                    System.out.println(number);
                }
        
        // 5. Array Multidimensi
        System.out.println("5. Array Multidimensi");
            int[][] matrix = {{ 1,0,0 }, { 0,1,0 }, { 0,0,1 }};
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
    }
}
