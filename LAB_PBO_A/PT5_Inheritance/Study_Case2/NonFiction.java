package LAB_PBO_A.PT5_Inheritance.Study_Case2;

public class NonFiction extends Book{
    String subject, expertiselevel;

    public NonFiction(String title, String author, int id, String subject, String expertiselevel) {
        super(title, author, id);
        this.subject = subject;
        this.expertiselevel = expertiselevel;
    }

    void displayInfo() {
        System.out.println(super.title);
        System.out.println(super.author);
        System.out.println(super.id);
        System.out.println(subject);
        System.out.println(expertiselevel);
    }
}
