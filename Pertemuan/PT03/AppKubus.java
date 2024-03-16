package Pertemuan.PT03;

public class AppKubus {
    
    public static void main(String[] args) {
        Kubus kubus1 = new Kubus(12); // Constructor berparameter

        System.out.println("Luas Permukaan = " + kubus1.LuasPermukaan());
        System.out.println("Volume = " + kubus1.Volume());

        Kubus kubus2 = new Kubus(); // Constructor tanpa parameter

        System.out.println("Luas Permukaan = " + kubus2.LuasPermukaan());
        System.out.println("Volume = " + kubus2.Volume());
    }
}
