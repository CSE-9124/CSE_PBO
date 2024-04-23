package LAB_PBO_A.PT5_Inheritance.A_Inheritance;

/* Pada class anak, kita menggunakan 
 * kata kunci extends untuk menyatakan kalau dia adalah
 * class tururan dari Enemy.
*/

public class Burung extends Enemy{
    void walk() {
        System.out.println("Burung berjalan");
    }

    void jump() {
        System.out.println("Burung loncat-loncat");
    }

    void fly() {
        System.out.println("Burung Terbang...");
    }
}
