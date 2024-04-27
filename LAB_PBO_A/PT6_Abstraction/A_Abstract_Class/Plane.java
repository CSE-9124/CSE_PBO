package LAB_PBO_A.PT6_Abstraction.A_Abstract_Class;

/* Abstraction adalah sebuah proses yang dilakukan untuk menyembunyikan
* detail implementasi/cara kerjanya dengan hanya menampilkan fungsi atau
* penggunanya kepada user. Kita dapat mengimplementasikan konsep abstraction 
* dengan menggunakan abstract class dan interface
*/

// Class abstract yang ditandai dengan keyword abstract
abstract class Plane {

    public Plane(){}

    // Abstract method
    abstract String getPlaneName();

    int getDimension() {
        return 2;
    }
}

/* Abstract class tidak dapat di instance menjadi sebuah objek. 
* untuk dapat menggunakan class tersebut, kita perlu mewarisi 
* class tersebut pada class turunannya.
* Setiap class yang mewarisi class induk abstract, harus membuat 
* implementasi dari setiap method-method abstract yang ada. 
*/
