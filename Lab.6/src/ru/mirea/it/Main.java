package ru.mirea.it;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] p1Cards = new int[5];
        for (int i = 0; i < 5; i++) {
            p1Cards[i] = scanner.nextInt();
        }

        int[] p2Cards = new int[5];
        for (int i = 0; i < 5; i++) {
            p2Cards[i] = scanner.nextInt();
        }

	    Game game = new Game(p1Cards, p2Cards);
        System.out.println(game.run());
    }
}
