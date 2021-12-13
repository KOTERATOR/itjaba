package ru.mirea.it;

import java.util.ArrayDeque;

public class Game {
    Player p1, p2;

    public Game(int[] p1Cards, int[] p2Cards) {
        p1 = new Player(p1Cards);
        p2 = new Player(p2Cards);
    }

    public int runRound() {
        if (p1.isEmpty()) {
            return 2;
        } else if (p2.isEmpty()) {
            return 1;
        }

        int card1 = p1.pullCard();
        int card2 = p2.pullCard();

        if (card1 == 0 && card2 == 9) {
            p1.putCards(card1, card2);
        } else if (card1 == 9 && card2 == 0) {
            p2.putCards(card2, card1);
        } else if (card1 > card2) {
            p1.putCards(card1, card2);
        } else if (card2 > card1) {
            p2.putCards(card2, card1);
        } else {
            p1.putCard(card1);
            p2.putCard(card2);
        }
        return 0;
    }

    public String run() {
        int step = 0;
        int r = 0;
        do {
            step++;
            r = runRound();
        } while (r == 0 && step < 106);

        if (r != 0) {
            String playerName;
            if (r == 1)
                playerName = "first";
            else if (r == 2)
                playerName = "second";
            else
                playerName = "unknown";

            return playerName + " " + (step-1);
        }
        else {
            return "botva";
        }
    }
}
