package meditator;

public class Main {
    public static void main(String[] args) {
        // Luo kilpailu
        Kilpailu kilpailu = new Kilpailu();
        // Luo kilpailijat
        kilpailu.lisaaHyppaaja(new Hyppaaja("Pekka"));
        kilpailu.lisaaHyppaaja(new Hyppaaja("Matti"));
        kilpailu.lisaaHyppaaja(new Hyppaaja("Maija"));
        // Lisää tuomarit
        kilpailu.lisaaArvostelutuomari(new Arvostelutuomari("Tuomari 1"));
        kilpailu.lisaaArvostelutuomari(new Arvostelutuomari("Tuomari 2"));
        kilpailu.lisaaArvostelutuomari(new Arvostelutuomari("Tuomari 3"));
        kilpailu.lisaaArvostelutuomari(new Arvostelutuomari("Tuomari 4"));
        kilpailu.lisaaArvostelutuomari(new Arvostelutuomari("Tuomari 5"));
        // Lisää mittari
        kilpailu.lisaaMittari(new Mittamies());
        // Aloita kilpailu
        kilpailu.aloitaKilpailu();
        // Tulosta tulokset
        kilpailu.tulostaTulokset();
    }
}
