package LAB_PBO_A.PT5_Inheritance.Study_Case2;

public class Fiction extends Book{
    String genre;
    boolean bestSeller;

    public Fiction(String title, String author, int id, String genre, boolean bestSeller) {
        super(title, author, id);
        this.genre = genre;
        this.bestSeller = bestSeller;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println(genre);
        System.out.println(bestSeller);
    }
}
