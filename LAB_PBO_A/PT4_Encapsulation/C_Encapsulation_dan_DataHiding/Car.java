package LAB_PBO_A.PT4_Encapsulation.C_Encapsulation_dan_DataHiding;

public class Car {
    private String kunci;
    private int kecepatan;
    private String spesifikasiMesin;

    // Constructor
    public Car(String kunci) {
        this.kunci = kunci;
    }

    // Getter untuk atribut kecepatan
    public int getKecepatan(String kunci) {
        if (this.kunci.equals(kunci)) {
            return kecepatan;
        } else {
            System.out.println("Kunci salah");
            return -1; // Nilai default jika kunci salah
        }
    }

    // Setter untuk atribut kecepatan
    public void setKecepatan(String kunci, int kecepatan) {
        if (this.kunci.equals(kunci)) {
            this.kecepatan = kecepatan;
        } else {
            System.out.println("Kunci Salah");
        }
    }

    // Getter untuk atribut spesifikasiMesin
    public String getSpesifikasiMesin(String kunci) {
        if (this.kunci.equals(kunci)) {
            return spesifikasiMesin;
        } else {
            System.out.println("Kunci salah");
            return null; // Nilai default jika kunci salah
        }
    }

    // Setter untuk atribut spesifikasiMesin
    public void setSpesifikasiMesin(String kunci, String spesifikasiMesin) {
        if (this.kunci.equals(kunci)) {
            this.spesifikasiMesin = spesifikasiMesin;
        } else {
            System.out.println("Kunci Salah");
        }
    }
}
