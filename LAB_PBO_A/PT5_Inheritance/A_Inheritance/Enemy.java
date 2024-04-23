package LAB_PBO_A.PT5_Inheritance.A_Inheritance;

/* Class Enemy adalah class induk yang memiliki class anak yaitu
 * Zombie, Pocong, dan Burung. Apapun properti yang ada di class
 * induk, akan dimiliki juga oleh class anak
*/ 

public class Enemy {
    String name;
    int hp;
    int attackPoin;

    void attack() {
        System.out.println("Serang!");
    }
}
