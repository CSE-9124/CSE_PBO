package Tugas_LAB_PBO.TP_6.Task1_Classes.Dog;

public class GermanShepherd extends Dog{

    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.setPosition(this.getPosition() + 3);
        System.out.println("German Shepherd berpindah posisi ke posisi " + this.getPosition());
    }

    @Override
    public void describe() {
        System.out.println("""
            Jenis doggy yang paling dihormati dan diakui secara 
            internasional. Mereka terkenal karena kecerdasan 
            mereka yang tinggi, keterampilan kerja yang luar biasa, 
            dan loyalitas yang tak tergoyahkan terhadap pemiliknya.
            Memiliki kepala yang proporsional dengan tubuh, telinga 
            tegak, dan mata yang cenderung cokelat gelap.
            """);
    }
}
