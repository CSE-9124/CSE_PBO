package LAB_PBO_A.PT4_.Study_Case;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Masashi Kishimoto", "narutoshippuden@gmail.com", 'L');
    
        Book buku = new Book("Naruto Shippuden", author, 9.99);
     
        System.out.println("Author:");
        System.out.println("Nama : " + author.getName());
        System.out.println("Email : " + author.getEmail());
        System.out.println("Gender : " + author.getGender());

        System.out.println("\nBuku:");
        System.out.println("Nama Buku: " + buku.getName());
        System.out.println("Author Buku: " + buku.getAuthor().getName());
        System.out.println("Harga Buku: " + buku.getPrice());
    }    
}
