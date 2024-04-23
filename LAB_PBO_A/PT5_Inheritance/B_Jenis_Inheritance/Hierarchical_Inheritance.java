package LAB_PBO_A.PT5_Inheritance.B_Jenis_Inheritance;

/* Ketika dua atau lebih kelas mewarisi satu kelas, itu dikenal sebagai inheritance hierarchical */

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

class Cat extends Animal {
    void meow() {
        System.out.println("meowing...");
    }
}

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.meow();
        c.eat();

        // c.bark(); //C.T.Error
    }
}
