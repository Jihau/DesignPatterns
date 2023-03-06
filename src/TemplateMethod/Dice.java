package TemplateMethod;

import java.util.Random;

public class Dice extends Game {
    int winner;
    boolean gameOver;
    Random random;

    @Override
    void initializeGame() {
        gameOver = false;
        random = new Random();
    }

    @Override
    void makePlay(int player) {
        System.out.println("rolling a dice..");
        int rolled = random.nextInt(1, 7 + 1);

        System.out.println(rolled);
        if (rolled == 7) {
            winner = player + 1;
            gameOver = true;
        }
    }

    @Override
    boolean endOfGame() {
        return gameOver;
    }

    @Override
    void printWinner() {
        System.out.println("Congratulations! You won " + winner);
    }
}