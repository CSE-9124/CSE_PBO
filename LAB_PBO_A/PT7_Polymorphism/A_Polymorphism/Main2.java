package LAB_PBO_A.PT7_Polymorphism.A_Polymorphism;

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Animal hewan = new Animal();
        Dog dog = new Dog();

        System.out.println(dog instanceof Animal);
        System.out.println(hewan instanceof Animal);
    }
}
