package meditator;

public class Hyppy {
    private final int pituus;
    private final int tyyli;

    public Hyppy(int pituus, int tyyli) {
        this.pituus = pituus;
        this.tyyli = tyyli;
    }

    public static Hyppy getHyppy() {
        return new Hyppy(10, 10);
    }

    public int getPituus() {
        return pituus;
    }

    public void setPituus(int pituus) {
    }

    public int getTyyli() {
        return tyyli;
    }

    public void setTyyli(int tyyli) {
    }

    public int getPituusPisteet() {
        // Laske hyppypituudesta saatavat pisteet
        return pituus;
    }

    public int getTyyliPisteet() {
        // Laske hyppytyylistä saatavat pisteet
        return tyyli;
    }

    public Hyppaaja getHyppaaja() {
        return new Hyppaaja("Matti");
    }
}
