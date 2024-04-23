package LAB_PBO_A.PT5_Inheritance.B_Jenis_Inheritance;

/* Ketika ada rantai warisan, itu dikenal sebagai inheritance multilevel */

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("weeping...");
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}
