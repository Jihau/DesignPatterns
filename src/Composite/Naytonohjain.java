package Composite;

public class Naytonohjain implements Laiteosa {
    private int hinta;

    public Naytonohjain(int hinta) {
        this.hinta = hinta;
    }

    @Override
    public int getHinta() {
        return hinta;
    }
}