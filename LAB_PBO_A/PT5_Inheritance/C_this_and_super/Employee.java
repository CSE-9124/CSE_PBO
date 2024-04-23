package LAB_PBO_A.PT5_Inheritance.C_this_and_super;

/* Jika thisa merepresentasikan objek dari class itu sendiri, maka
 * super akan merepresentasikan objek dari class induk
 */

public class Employee extends Person {
    float salary = 4000f;

    String name = "Sakura";

    int age = 23;

    public void showInfo() {
        System.out.println("Name: " + super.name);

        System.out.println("Age: " + super.age);

        System.out.println("Salary: $" + salary);
    }
}
