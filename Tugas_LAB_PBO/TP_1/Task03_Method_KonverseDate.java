package Tugas_LAB_PBO.TP_1;

import java.util.Scanner;

public class Task03_Method_KonverseDate {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String Date = input.nextLine();

        String hasil = KonverseDate(Date);
        System.out.println(hasil);

        input.close();
    }

    // Method
    public static String KonverseDate(String Date) {
        String[] parts = Date.split("-");

        int tanggal = Integer.parseInt(parts[0]);
        String bulan = new String(parts[1]);
        int tahun = Integer.parseInt(parts[2]);

        switch (bulan) {
            case "01":
                bulan = "Januari";
                break;
            case "02":
                bulan = new String("Febuari");
                break;
            case "03":
                bulan = new String("Maret");
                break;
            case "04":
                bulan = new String("April");
                break;
            case "05":
                bulan = new String("May");
                break;
            case "06":
                bulan = new String("Juni");
                break;
            case "07":
                bulan = new String("Juli");
                break;
            case "08":
                bulan = new String("Agustus");
                break;
            case "09":
                bulan = new String("September");
                break;
            case "10":
                bulan = new String("Oktober");
                break;
            case "11":
                bulan = new String("November");
                break;
            case "12":
                bulan = new String("Desember");
                break;
            default:
                break;
        }

        if (tahun >= 00 && tahun <= 24) {
            tahun += 2000;
        }
        else {
            tahun += 1900;
        }

        return tanggal + " " + bulan + " " + tahun;
    }

}
