package TemplateMethod;

abstract class Game {

    protected int playersCount;
    abstract void initializeGame();
    abstract void makeAMove(int player);
    abstract boolean gameOver();
    abstract void printWinner();

    /* Template method: */
    public final void playOneGame(int playersCount) {
        this.playersCount = playersCount;
        initializeGame();
        int j = 0;
        while (!gameOver()){
            makeAMove(j);
            j = (j + 1) % playersCount;
        }
        printWinner();
    }
}