package LAB_PBO_A.PT7_Polymorphism.A_Polymorphism;

/* Polymorphism artinya "Banyak bentuk" berarti merupakan 
 * konsep/kemampuan dari suatu objek untuk merepresentasikan satu 
 * bentuk ke dalam banyak bentuk.
*/

interface Vegetarian {}
class Hewan {}
class Rusa extends Hewan implements Vegetarian{}

/* Dari contoh di atas, class Rusa dianggap polymorphic karena 
 * class ini memiliki multiple inheritance. Sehingga akan berlaku:
 * - Rusa adalah Hewan
 * - Rusa adalah Vegetarian
 * - Rusa adalah Rusa
 * - Rusa adalah Objek 
*/

/* Sebuah reference variable dapat merujuk ke subtype apapun dari
 * jenis yang dideklarasikan dan dapat dideklarasikan sebagai class
 * atau interface type.
*/

public class Main {
    Rusa rusa = new Rusa();
    Hewan hewan = rusa;
    Vegetarian vegan = rusa;
    Object obj = rusa;
}
