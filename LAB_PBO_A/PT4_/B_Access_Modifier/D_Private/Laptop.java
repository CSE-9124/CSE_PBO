package LAB_PBO_A.PT4_.B_Access_Modifier.D_Private;

final class Laptop {
    private String processor;

    public Laptop(String processor) {
        this.processor = processor;
    }

    private void printProcessor() {
        System.out.println("Pinjam dulu Seratus " + processor);
    }

    public void callPintProcessor() {
        printProcessor();
    }
}

// Final Class
/* Classyang dideklarasikan dengan access modifier final tidak bisa
di-extend oleh class lain (tidak bisa diwariskan ke class lain) */