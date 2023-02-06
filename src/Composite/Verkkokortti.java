package Composite;

public class Verkkokortti implements Laiteosa {
    private int hinta;

    public Verkkokortti(int hinta) {
        this.hinta = hinta;
    }

    @Override
    public int getHinta() {
        return hinta;
    }
}