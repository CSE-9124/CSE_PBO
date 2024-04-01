package LAB_PBO_A.PT3_Attribute_Behavior_dan_Constructor;

import java.util.ArrayList;

// PART 1
class Book {
    String title, author, isbn;
    double price;
    int quantitylnStock;

    public Book(String title, String author, String isbn, double price, int quantitylnStock) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.quantitylnStock = quantitylnStock;
    }
    
    void borrowBook(int quantity) {
        if (quantity > quantitylnStock) {
            System.out.println("Insufficient Stock!, the remeining stock of" + title + " is " + quantitylnStock);
        } else {
            this.quantitylnStock -= quantity;
            System.out.println(quantity + " copies of \"" + title + "\" sold.");
        }
    }
    
    void restock(int quantity) {
        this.quantitylnStock += quantity;
        System.out.println(quantity + " copies of \"" + title + "\" restocked.");;
    }
    
    void displayInfo() {
        System.out.println("Title \t\t: " + title);
        System.out.println("Author \t\t: " + author);
        System.out.println("ISBN \t\t: " + isbn);
        System.out.println("Price \t\t: $" + price);
        System.out.println("Available Stock : " + quantitylnStock);
    }
}

// PART 2
class Library_Member {
    String name, memberID;

    // PART 3
    ArrayList<Book> borrowedBooks; // Menyimpan daftar buku yang dipinjam

    public Library_Member(String name, String memberID) {
        this.name = name;
        this.memberID = memberID;

        this.borrowedBooks = new ArrayList<>();
    }

    void displayInfo() {
        System.out.println("Name \t\t: " + name);
        System.out.println("Member ID \t: " + memberID);
        System.out.println("Borrowed Books  : ");

        for (Book book : borrowedBooks) {
            System.out.println("# \"" + book.title + "\"");
        }
    }

    void borrowBook(Book book, int quantity) {
        for (int i = 0; i < quantity; i++) {
            borrowedBooks.add(book);
        }

        book.borrowBook(quantity); // Memanggil method borrowedBook di kelas Book
        System.out.println(name + " has borrowed " + quantity + " copies of \"" + book.title + "\"");
    }

    void returnBook(Book book, int quantity) {
        int count = 0;

        for (int i = 0; i < borrowedBooks.size(); i++) {
            if (borrowedBooks.get(i) == book && count < quantity) {
                borrowedBooks.remove(i);
                count++;
            }
        }

        book.restock(quantity); // Memanggil method restock di kelas Book
        System.out.println("Returned " + quantity + " copies of \"" + book.title + "\"");
    }
}


public class Study_Case {
    public static void main(String[] args) {

        // Membuat objek dari kelas Library_Member
        Library_Member member1 = new Library_Member("John Smith", "LM12345");
        Library_Member member2 = new Library_Member("Jane Doe", "LM54321");
        
        System.out.println("\nMember 1 Info :");
        member1.displayInfo();
        
        System.out.println("\nMember 2 Info :");
        member2.displayInfo();
        
        
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "H565", 10.99, 50);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "Y9084", 9.99, 30);
        
        // Menampilkan Informasi Buku sebelum dipinjam
        System.out.println("\n---------- BEFORE STUDENT BORROW SOME BOOK ----------");
        System.out.println("\nBook 1 Info :");
        book1.displayInfo();
        
        System.out.println("\nBook 2 Info :");
        book2.displayInfo();
        
        // Menampilakn Proses Buku dipinjam
        System.out.println("\n---------- PROCESS STUDENT BORROW SOME BOOK ----------\n");
        member1.borrowBook(book2, 1);
        member2.borrowBook(book1, 3);
        
        // Menampilkan Informasi Buku Setelah dipinjam
        System.out.println("\n----------- AFTER STUDENT BORROW SOME BOOK -----------");
        System.out.println("\nMember 1 Info :");
        member1.displayInfo();
        
        System.out.println("\nMember 2 Info :");
        member2.displayInfo();
        
        System.out.println("\nBook 1 Info :");
        book1.displayInfo();
        
        System.out.println("\nBook 2 Info :");
        book2.displayInfo();
        
        // Menampilakn Proses Buku dikembalikan
        System.out.println("\n---------- PROCESS STUDENT BORROW SOME BOOK ----------\n");
        member1.returnBook(book2, 1);
        member2.returnBook(book1, 1);

        // Menampilkan Informasi Buku Setelah dikembalikan
        System.out.println("\n----------- AFTER STUDENT BORROW SOME BOOK -----------");
        System.out.println("\nMember 1 Info:");
        member1.displayInfo();

        System.out.println("\nMember 2 Info:");
        member2.displayInfo();
    }
}
