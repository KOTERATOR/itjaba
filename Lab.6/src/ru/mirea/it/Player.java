package ru.mirea.it;

import java.util.ArrayDeque;

public class Player {
    private ArrayDeque<Integer> cards = new ArrayDeque<>();

    public Player(int[] cards) {
        for (int card : cards) {
            this.cards.addLast(card);
        }
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public Integer pullCard() {
        return cards.pollFirst();
    }

    public void putCards(int card1, int card2) {
        cards.addLast(card1);
        cards.addLast(card2);
    }

    public void putCard(int card) {
        cards.addLast(card);
    }
}
