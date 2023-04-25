package meditator;

public class Kilpailu {
    public void lisaaArvostelutuomari(Arvostelutuomari tuomari) {
    }
public Hyppaaja lisaaHyppaaja(Hyppaaja hyppaaja) {
        return hyppaaja;
    }
public <Mittari> void lisaaMittari(Mittari mittari) {
    }
public void aloitaKilpailu() {
        Hyppaaja[] hyppaajat = new Hyppaaja[3];
    }

    public void tulostaTulokset() {
        Tulostaulu tulostaulu = new Tulostaulu();
        tulostaulu.tulostaTulokset();
    }
}
