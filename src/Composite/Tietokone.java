package Composite;

public class Tietokone {
    private Laiteosa emolevy;
    private Laiteosa kotelo;

    public Tietokone(Laiteosa emolevy, Laiteosa kotelo) {
        this.emolevy = emolevy;
        this.kotelo = kotelo;
    }

    public int laskeHinta() {
        return emolevy.getHinta() + kotelo.getHinta();
    }
}