package Tugas_LAB_PBO.TP_1;

import java.util.Scanner;

public class Task02_Change_FirstWordIntoKapital {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
    
        System.out.print("Masukkan Judul Film :  \n> ");
        String film = input.nextLine();

        CapitalFirstWord(film);

        input.close();
    }

    // Method
    public static void CapitalFirstWord(String film) {
        String[] Words = film.split(" ");

        for (String kata : Words) {
            char firstChar = Character.toUpperCase(kata.charAt(0));
            String restWord = kata.substring(1).toLowerCase();

            System.out.print(firstChar + restWord + " ");
        }
    }
}