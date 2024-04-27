package LAB_PBO_A.PT6_Abstraction.B_Interface;

/* - Interface dapat dianalogikan sebagai sebuah blueprint untuk sebuah class.
*  - Sama seperti abstract class, interface tidak dapat di instance menjadi sebuah objek.
*  - Method-method interface juga tidak memiliki body, bodynya akan disediakan oleh implement class.
 */

interface Describable {
    
    void describe();

    // Default Method
    default void show() {
        System.out.println("Default show method");
    }

    // Static Method
    static void showInfo() {
        System.out.println("Static show method");
    }

    // Private Method (tidak dapat diakses dari kelas turunan)
    @SuppressWarnings("unused")
    private void showMessage() {
        System.out.println("Private show method");
    }
}


/* - Attribute dalam sebuah interface secara default akan memiliki modifier public, static, dan final 
 * - Method yang didefinisikan dalam sebuah interface akan memiliki modifier public dan abstract
*/


class Human implements Describable{
    String name;
    int age;

    @Override
    public void describe() {
        System.out.println("This class covers basic information about human");
    }

    @Override
    public void show() {
        Describable.super.show();
    }

    private void walk() {
        System.out.println("Human is currently walking");
    }

    public static void main(String[] args) {
        Human human = new Human();
        human.walk();

        human.show();
        Describable.showInfo();
        // human.showMessage(); // Error
    }
}

/* Dalam implement class, kita perlu override atau menuliskan body dari setiap method yang ada pada interface yang di implementasikan */
