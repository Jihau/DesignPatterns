package Memento;

public class Memento {
    private final int secretNumber;

    public Memento(int secretNumber) {
        this.secretNumber = secretNumber;
    }

    public int getArvottuLuku() {
        return secretNumber;
    }
}