package LAB_PBO_A.PT6_Abstraction.Study_Case;

public class LP extends Artikel{
    String nameOfArtist;
    int nrOfRecords;

    @Override
    void addArtikel() {
        System.out.println("Nambah");
    }
    
    @Override
    void removeArtikel() {
        System.out.println("");
        
    }
}
