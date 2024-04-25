package Latihan.Project;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        Raket raket1 = new Raket();
        raket1.setMerk("Li-ning");
        raket1.setSenar(20);
        
        Raket raket2 = new Raket("Yonex", 20);
        
        Badminton player2 = new Badminton();
        player2.setPlayer("Kento Momota");
        player2.setGender("Male");
        player2.setPower(50);
        player2.setSpeedPlayer(100);
        player2.setRaket(raket2);
        
        line();
        System.out.println("            WELCOME TO BADMINTON SPORT            ");
        line();
        System.out.print("Sign Your Name   : ");
        String name = sc.nextLine();
        System.out.print("Sign Your Gender : ");
        String gender = sc.nextLine();
        
        Badminton player1 = new Badminton(name, gender, 50, 100, raket1.getMerk(), raket1.getSenar());

        line();
        System.out.println("           GET READY FOR THE NEXT MATCH           ");
        line();
        player1.statusPlayer();
        player2.statusPlayer();
        
        while (player1.getPoint() < 21 && player2.getPoint() < 21) {
            // Check if player1 needs to start serve
            if (player1.getPoint() % 2 == 1) {
                player1.startServe();
            }
            
            line();
            System.out.println("Player 1, choose your action:");
            System.out.println("1. Hit");
            System.out.println("2. Smash");
            System.out.println("3. Upgrade String");
            System.out.println("4. Display Player Status");
            System.out.print("Your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            line();

            switch (choice) {
                case 1:
                    player1.hitShuttlecock(player2);
                    break;
                case 2:
                    player1.smashShuttlecock(player2);
                    break;
                case 3:
                    player1.getRaket().upgradeRaket();
                    break;
                case 4:
                    player1.statusPlayer();
                    break;
                default:
                    System.out.println("Invalid choice! Please choose again.");
            }

            // Check if player2 needs to start serve
            if (player2.getPoint() % 2 == 1) {
                player2.startServe();
            }

            // Player 2 action (random)
            int randomChoice = rand.nextInt(2) + 1; // Generates random number between 1 and 2
            switch (randomChoice) {
                case 1:
                    player2.hitShuttlecock(player1);
                    break;
                case 2:
                    player2.smashShuttlecock(player1);
                    break;
            }
        }

        // After the loop ends, determine the winner
        if (player1.getPoint() >= 21) {
            System.out.println(player1.getPlayer() + " wins the game!");
        } else {
            System.out.println(player2.getPlayer() + " wins the game!");
        }

            sc.close();
        }

    public static void line(){
        System.out.println("==================================================");
    }
}
