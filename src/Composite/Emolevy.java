package Composite;

import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Laiteosa {
    private final List<Laiteosa> komponentit;
    private int hinta;

    public Emolevy(int hinta) {
        this.hinta = hinta;
        this.komponentit = new ArrayList<>();
    }

    public void lisaaKomponentti(Laiteosa komponentti) {
        this.komponentit.add(komponentti);
    }
    @Override
    public int getHinta() {
        int komponenttienHinta = 0;
        for (Laiteosa komponentti : komponentit) {
            komponenttienHinta += komponentti.getHinta();
        }
        return hinta + komponenttienHinta;
    }
}