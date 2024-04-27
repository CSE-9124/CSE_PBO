package LAB_PBO_A.PT6_Abstraction.Study_Case;

abstract class Artikel {
    String name, publisher;
    int yearOfRelease;

    abstract void addArtikel();

    abstract void removeArtikel();
}
