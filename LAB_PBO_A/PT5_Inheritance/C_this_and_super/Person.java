package LAB_PBO_A.PT5_Inheritance.C_this_and_super;

/* Kata kunci this digunakan sebagai referensi dari class itu sendiri */

public class Person {
    String name = "Sasuke";

    int age = 22;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
