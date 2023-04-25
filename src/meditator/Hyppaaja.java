package meditator;

public class Hyppaaja {
    private String nimi;
    private Hyppy[] hypyt;

    public Hyppaaja(String nimi) {
        this.nimi = nimi;
        this.hypyt = new Hyppy[2];
    }

    public void hyppaa(Hyppy hyppy) {
        if (hypyt[0] == null) {
            this.hypyt[0] = hyppy;
        } else if (hypyt[1] == null) {
            this.hypyt[1] = hyppy;
        } else {
            throw new IllegalArgumentException("Hyppääjällä voi olla vain kaksi hyppyä");
        }
    }

    public Hyppy[] getHypyt() {
        return this.hypyt;
    }

    public static String getNimi() {
        return Hyppaaja.getNimi();
    }

    public void setKilpailu(Kilpailu kilpailu) {
        kilpailu.lisaaHyppaaja(this);
    }
}
