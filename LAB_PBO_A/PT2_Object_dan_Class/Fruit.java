package LAB_PBO_A.PT2_Object_dan_Class;

// Class
public class Fruit {
    
    // Atribut
        String nama;
        String warna;
        int harga;

    // Method
        public void cetakNama(String nama) {
            System.out.println("Nama buah : " + nama);
        }

        public void warnaBuah(String warnaBuhan) {
            warna = warnaBuhan;
        }

        public void hargaBuah(int hargaBuah) {
            harga = hargaBuah;
        }

        public void namaBuah(String namaBuah) {
            nama = namaBuah;
        }

        public void detailBuah() {
            System.out.println("Nama Buah : " + nama);
            System.out.println("Warna : " + warna);
            System.out.println("Harga Buah : " + harga);
        }
}

/*
A method is a block of code which only runs when it is called.
Methods are used to perform certain actions, and 
they are also known as functions.


static : means that the method belongs to the Main class and
not an object of the Main class.


void : means that this method does not have a return value.
The void keyword, indicates that the method should not return 
a value. 
If you want the method to return a value, you can use a 
primitive data type (such as int, char, etc.) 
instead of void, and use the return keyword inside the method
 */