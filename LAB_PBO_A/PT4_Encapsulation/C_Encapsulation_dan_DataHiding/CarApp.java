package LAB_PBO_A.PT4_Encapsulation.C_Encapsulation_dan_DataHiding;

public class CarApp {
    public static void main(String[] args) {
        Car mobil = new Car("Honda");
        
        mobil.setKecepatan("Honda", 60);
        mobil.setSpesifikasiMesin("Honda", "600 CC");

        System.err.println(mobil.getKecepatan("Honda"));
        System.out.println(mobil.getSpesifikasiMesin("Honda"));
    }
}
