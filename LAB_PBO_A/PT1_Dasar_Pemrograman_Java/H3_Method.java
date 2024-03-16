package LAB_PBO_A.PT1_Dasar_Pemrograman_Java;

class H3_Method {
    
    public static void main(String[] args) {
        
        System.out.println("Method Rekursif");
            System.out.println(factorial(1));
    }

    // Method Rekursif
    public static int factorial(int n) {
        return n == 0 ? 1 : n * factorial(n - 1);
    }
}

/* Method Rekursif adalah method yang bodynya memanggil dirinya sendiri, 
method rekursif bisanya digunakan untuk mempersingkat kode dan 
membuatnya elegan, akan tetapi rekursif memebutuhkan banyak memori dan 
lebih lambat.
*/