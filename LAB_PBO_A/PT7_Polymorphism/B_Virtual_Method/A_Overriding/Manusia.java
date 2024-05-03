package LAB_PBO_A.PT7_Polymorphism.B_Virtual_Method.A_Overriding;

/* Kita dapat mencapai polymorphism di Java menggunakan beberapa 
 * virtual method berikut:
 * - Method Overriding (nama method sama tapi isi body berbeda)
 * - Method Overloading (nama method sama tapi mempunyai parameter yg berbeda)
 * - Operator Overloading (operator +, yg memiliki beda fungsi pada integer dan String)
*/

public class Manusia {
    void makan() {
        System.out.println("Manusia makan");
    }

    void tidur() {
        System.out.println("Manusia tidur");
    }

    void bergerak() {
        System.out.println("Manusia bergerak");
    }
}
