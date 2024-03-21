package Pertemuan.PT04.paketA;

public class mahasiswa {
    
    public String nama;
    String nim;
    private double ipk;
    protected int usia;
    
    // Encapsulation
        // Setter
    public void setIPK(double ipk) {
        this.ipk = ipk;
    }

        // Getter
    public double getIPK() {
        return this.ipk;
    }


    public void sayHello() {
        System.out.println("Hello" + nama);
    }

    void cekIPK() {
        if (ipk > 3){
            System.out.println("IPK " + nama + " Baik");
        } else if (ipk > 2 && ipk < 3) {
            System.out.println("IPK" + nama + " cukup");
        } else {
            System.out.println("IPK " + nama + " Kurang");
        }
    }
    
}
