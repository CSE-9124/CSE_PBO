package LAB_PBO_A.PT5_Inheritance.Study_Case2;

public class Book {
    String title, author;
    int id;
    
    public Book(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    void displayInfo() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(id);
    }
}
