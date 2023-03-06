package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting the card game.");
        CardGame newgame = new CardGame();
        newgame.playOneGame(4); // can specify number of players here
    }
}