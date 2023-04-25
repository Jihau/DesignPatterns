package meditator;

import java.util.List;

public class Tulosrivi {
    private Hyppaaja hyppaaja;
    private int pisteet;

    public Tulosrivi(Hyppaaja hyppaaja, int pisteet) {
        this.hyppaaja = hyppaaja;
        this.pisteet = pisteet;
    }

    public Tulosrivi(String nimi, double pituus, List<Integer> pisteet) {
        this.hyppaaja = new Hyppaaja(getHyppaaja().getNimi());
        this.pisteet = pisteet.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Tulosrivi: " + nimi + " " + pituus + " " + pisteet);
    }

    public Hyppaaja getHyppaaja() {
        return hyppaaja;
    }
}