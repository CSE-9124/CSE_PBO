package LAB_PBO_A.PT2_Object_dan_Class;

import java.util.Scanner;

class GradeAnalyzer {
    int[] grades;

    double calculateAverage() {
        int jumlah = 0;
        for (int x : grades) {
            jumlah += x;
        }

        double rataan = jumlah / grades.length;
        return rataan;
    }

    String analyzeGrades() {
        double rataan = calculateAverage();
        if (rataan >= 70) {
            return"Lulus";
        }
        else {return "Tidak Lulus";}
    }
}

public class Study_Case_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] studentGrades = new int[6];

        System.out.print("Masukkan 6 nilai = ");
        for (int i = 0; i < studentGrades.length; i++) {
            studentGrades[i] = sc.nextInt();
        }

        GradeAnalyzer obj = new GradeAnalyzer();
        obj.grades = studentGrades;

        System.out.printf("Rata-rata nilai = %.2f", obj.calculateAverage());
        System.out.println("\nStatus = " + obj.analyzeGrades());
        
        sc.close();
    }    
}