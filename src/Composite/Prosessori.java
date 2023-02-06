package Composite;

public class Prosessori implements Laiteosa {
    private int hinta;

    public Prosessori(int hinta) {
        this.hinta = hinta;
    }

    @Override
    public int getHinta() {
        return hinta;
    }
}