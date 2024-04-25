package LAB_PBO_A.PT5_Inheritance.B_Jenis_Inheritance;

/* Ketika suatu kelas mewarisi kelas lain, itu dikenal sebagai single inheritance*/

class Bug {
    void eat() {
        System.out.println("eating...");
    }
}

class Butterfly extends Bug {
    void bark() {
        System.out.println("barking...");
    }
}

public class Single_Inheritance {
    public static void main(String[] args) {
        Butterfly d = new Butterfly();
        d.bark();
        d.eat();
    }
}
