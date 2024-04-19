package LAB_PBO_A.PT4_Encapsulation.D_ImmutableClass;

public class Main {
    public static void main(String[] args) {
        ImmutableClass immutable = new ImmutableClass("Cholyn", 19);
        // immutable.name = "Adnan lagi"; // Error karena atribut name bersifat private dan final
        System.out.println(immutable.getName());
    }
}
