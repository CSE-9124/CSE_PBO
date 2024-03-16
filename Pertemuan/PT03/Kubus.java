package Pertemuan.PT03;

import java.util.Scanner;

public class Kubus {
    double s;

    Kubus(double s) {
        this.s = s;
    }

    Kubus() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sisi : ");
        this.s = sc.nextDouble();
        sc.close();
    }

    double LuasPermukaan() {
        return 6 * s * s;
    }

    double Volume() {
        return s * s * s;
    }
}
