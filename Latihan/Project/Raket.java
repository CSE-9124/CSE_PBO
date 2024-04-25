package Latihan.Project;

public class Raket {
    String merk;
    int senar;

    public Raket() {}

    public Raket(String merk, int senar) {
        this.merk = merk;
        this.senar = senar;
    }

    public void upgradeRaket() {
        this.senar += 10;
    }
    
    // Getter & Setter
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public int getSenar() {
        return senar;
    }
    public void setSenar(int senar) {
        this.senar = senar;
    }
}
