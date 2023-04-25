package meditator;

import java.util.ArrayList;
import java.util.List;

public class Kisasihteeri implements Mediator {
    private final List<Arvostelutuomari> arvostelutuomarit;
    private final Mittamies mittamies;
    private final Tulostaulu tulostaulu;

    public Kisasihteeri() {
        this.arvostelutuomarit = new ArrayList<>();
        this.mittamies = new Mittamies();
        this.tulostaulu = new Tulostaulu();
    }

    @Override
    public void lisaaArvostelutuomari(Arvostelutuomari tuomari) {
        this.arvostelutuomarit.add(tuomari);
    }

    @Override
    public void mittaaHyppy(Hyppy hyppy) {
        double pituus = this.mittamies.mittaaPituus(hyppy);
        String nimi = hyppy.getHyppaaja().getNimi();
        List<Integer> pisteet = new ArrayList<>();
        for (Arvostelutuomari tuomari : this.arvostelutuomarit) {
            int pisteetTuomarilta = tuomari.annaTyyliPisteet();
            pisteet.add(pisteetTuomarilta);
        }
        this.tulostaulu.lisaaTulos(new Tulosrivi(nimi, pituus, pisteet));
    }

    @Override
    public void lisaaTulos(Tulosrivi rivi) {
        this.tulostaulu.lisaaTulos(rivi);
    }

    @Override
    public void tulostaTulokset() {
        this.tulostaulu.tulostaTulokset();
    }
}
