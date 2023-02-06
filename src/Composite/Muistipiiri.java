package Composite;

public class Muistipiiri implements Laiteosa {
    private int hinta;

    public Muistipiiri(int hinta) {
        this.hinta = hinta;
    }

    @Override
    public int getHinta() {
        return hinta;
    }
}