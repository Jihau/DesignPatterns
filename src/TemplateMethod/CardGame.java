package TemplateMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardGame extends Game {

    private int winner;
    private boolean gameOver;
    private Random random;
    private List<String> deck;

    @Override
    void initializeGame() {
        gameOver = false;
        random = new Random();
        deck = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }
    }

    @Override
    void makeAMove(int player) {
        System.out.println("Drawing a card..");
        int drawnIndex = random.nextInt(deck.size());
        String drawnCard = deck.get(drawnIndex);
        System.out.println("Player " + (player + 1) + " drew a " + drawnCard);
        deck.remove(drawnIndex);

        if (deck.isEmpty()) {
            winner = player + 1;
            gameOver = true;
        }
    }

    @Override
    boolean gameOver() {
        return gameOver;
    }

    @Override
    void printWinner() {
        System.out.println("Congratulations! Player " + winner + " won the game.");
    }
}