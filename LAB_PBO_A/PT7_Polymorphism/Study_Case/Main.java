package LAB_PBO_A.PT7_Polymorphism.Study_Case;

class Pegawai {
    String nama;
    int gaji;

    public Pegawai(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    int infoGaji() {
        return gaji;
    }
}

class Manajer extends Pegawai{
    int tunjangan;

    public Manajer(String nama, int gaji, int tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    @Override
    int infoGaji() {
        return super.infoGaji();
    }

    int infoTunjangan() {
        return tunjangan;
    }
}

class Programmer extends Pegawai{
    int bonus;

    public Programmer(String nama, int gaji, int bonus) {
        super(nama, gaji);
        this.bonus = bonus;
    }

    @Override
    int infoGaji() {
        return super.infoGaji();
    }

    int infoBonus() {
        return bonus;
    }
}

public class Main {
    public static void main(String[] args) {
        Pegawai [] pegawais = new Pegawai[3];
        pegawais[0] = new Manajer("Abdul", 1000000, 10);
        pegawais[1] = new Programmer("Cholyn", 2000000, 10);
        pegawais[2] = new Pegawai("Billy", 1000000);

        for (int i = 0; i < pegawais.length; i++) {
            System.out.println(pegawais[i].infoGaji());
            System.out.println();
        }
    }
    
}
