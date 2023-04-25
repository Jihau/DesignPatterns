package meditator;

public interface Mediator {
    void lisaaArvostelutuomari(Arvostelutuomari tuomari);

    void mittaaHyppy(Hyppy hyppy);

    public void lisaaTulos(Tulosrivi rivi);
    public void tulostaTulokset();
}
