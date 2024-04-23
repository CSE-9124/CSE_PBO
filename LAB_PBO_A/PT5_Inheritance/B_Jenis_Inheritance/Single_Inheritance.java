package LAB_PBO_A.PT5_Inheritance.B_Jenis_Inheritance;

/* Ketika suatu kelas mewarisi kelas lain, itu dikenal sebagai single inheritance*/

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

public class Single_Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
