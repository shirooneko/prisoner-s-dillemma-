package Modul06;

import java.util.Random;
import java.util.Scanner;

public class Case1Main {
    public static void main (String[] args) {
        Random acak = new Random();
        Scanner scInt = new Scanner(System.in);

        int pilihan = -1;
        while (pilihan != 0) {
            System.out.println("1. Random Game");
            System.out.println("2. Player 2 vs Random Game");
            System.out.println("3. Player 1 vs Player 2");
            System.out.println("0. Exit");
            System.out.print("Chose You Game : ");
            pilihan = scInt.nextInt();

            if (pilihan == 1) {
                System.out.println("Play Game...");
                int strategiPlayer1 = acak.nextInt(2);
                int strategiPlayer2 = acak.nextInt(2);
                Player player1 = new Player(strategiPlayer1);
                Player player2 = new Player(strategiPlayer2);
                Game currentGame = new Game(player1,player2);
                currentGame.hitungPayoff();
                if(strategiPlayer1 == 0){
                    System.out.println("Player 1 choose to: COOPERATIVE");
                }
                else{
                    System.out.println("Player 1 choose to: DEFECTIVE");
                }
                if(strategiPlayer2 == 0){
                    System.out.println("Player 2 choose to: COOPERATIVE");
                }
                else{
                    System.out.println("Player 2 choose to: DEFECTIVE");
                }
                System.out.println("Total Score: Player1: "+player1.getSkor()+" Player 2: "+player2.getSkor());
                System.out.println("Play again? (0: exit, 1: play0");
                pilihan = scInt.nextInt();
            }
            if (pilihan == 2) {
                System.out.println("Player1's strategy (0:cooperative, 1:defective): ");
                int strategiPlayer1 = scInt.nextInt();
                System.out.println("Play Game...");
                int strategiPlayer2 = acak.nextInt(2);
                Player player1 = new Player(strategiPlayer1);
                Player player2 = new Player(strategiPlayer2);
                Game currentGame = new Game(player1,player2);
                currentGame.hitungPayoff();
                if(strategiPlayer1 == 0){
                    System.out.println("Player 1 choose to: COOPERATIVE");
                }
                else{
                    System.out.println("Player 1 choose to: DEFECTIVE");
                }
                if(strategiPlayer2 == 0){
                    System.out.println("Player 2 choose to: COOPERATIVE");
                }
                else{
                    System.out.println("Player 2 choose to: DEFECTIVE");
                }
                System.out.println("Total Score: Player1: "+player1.getSkor()+" Player 2: "+player2.getSkor());
                System.out.println("Play again? (0: exit, 1: play)");
                pilihan = scInt.nextInt();
            }
            if (pilihan == 3) {
                System.out.println("Player1's strategy (0:cooperative, 1:defective): ");
                int strategiPlayer1 = scInt.nextInt();
                System.out.println("Player2's strategy (0:cooperative, 1:defective): ");
                int strategiPlayer2 = scInt.nextInt();
                System.out.println("Play Game...");
                Player player1 = new Player(strategiPlayer1);
                Player player2 = new Player(strategiPlayer2);
                Game currentGame = new Game(player1,player2);
                currentGame.hitungPayoff();
                if(strategiPlayer1 == 0){
                    System.out.println("Player 1 choose to: COOPERATIVE");
                }
                else{
                    System.out.println("Player 1 choose to: DEFECTIVE");
                }
                if(strategiPlayer2 == 0){
                    System.out.println("Player 2 choose to: COOPERATIVE");
                }
                else{
                    System.out.println("Player 2 choose to: DEFECTIVE");
                }
                System.out.println("Total Score: Player1: "+player1.getSkor()+" Player 2: "+player2.getSkor());
                System.out.println("Play again? (0: exit, 1: play)");
                pilihan = scInt.nextInt();
            }
        }
        System.out.println("See you again!");
    }
}
