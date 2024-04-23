package LAB_PBO_A.PT5_Inheritance.A_Inheritance;

/* Pada class anak, kita menggunakan 
 * kata kunci extends untuk menyatakan kalau dia adalah
 * class tururan dari Enemy.
*/

public class Zombie extends Enemy{
    void walk() {
        System.out.println("Zombie Jalan-jalan");
    }
}
