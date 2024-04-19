package LAB_PBO_A.PT4_Encapsulation.D_ImmutableClass;

/* Immutable class adalah class di java yang tidak bisa diubah setelah dibuat */

public final class ImmutableClass {
    private final String name; // Deklarasikan atribut name sebagai final
    private final int age; // Deklarasikan atribut age sebagai final

    // Constructor untuk inisialisasi nilai name dan age
    public ImmutableClass(String name, int age) {
        this.name = name; // Inisialisasi atribut name
        this.age = age; // Inisialisasi atribut age
    }

    // Getter untuk mendapatkan nilai name
    public String getName() {
        return name; // Mengembalikan nilai atribut name
    }

    // Getter unutk mendapatkan nilai age
    public int gatAge() {
        return age; // Mengembalikan nilai atribut age
    }
}
