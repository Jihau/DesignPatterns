package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting the dice game.");
        Dice newgame = new Dice();
        newgame.playOneGame(3);
    }
}