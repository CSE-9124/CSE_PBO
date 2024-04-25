package LAB_PBO_A.PT5_Inheritance.B_Jenis_Inheritance;

/* Ketika ada rantai warisan, itu dikenal sebagai inheritance multilevel */

class Reptil {
    void eat() {
        System.out.println("eating...");
    }
}

class Komodo extends Reptil {
    void bark() {
        System.out.println("barking...");
    }
}

class Lizard extends Komodo {
    void weep() {
        System.out.println("weeping...");
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Lizard d = new Lizard();
        d.weep();
        d.bark();
        d.eat();
    }
}
