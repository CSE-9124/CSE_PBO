package LAB_PBO_A.PT5_Inheritance.Study_Case2;

public class Main {
    public static void main(String[] args) {
        Book buku = new Book("Classroom Of The Elite", "Shougo Kinugasa", 123);
        buku.displayInfo();

        Fiction fiksi = new Fiction("Dragon Ball Z", "Akira Toriyama", 456, "Action, Adventure", true);
        fiksi.displayInfo();

        NonFiction nonfiksi = new NonFiction("Sebuah Seni Untuk Bersikap Bodo Amat", "Mark manson", 567, "Filosofi", null);
        nonfiksi.displayInfo();
    }


}
