package meditator;

public class Tulostaulu {
    public void naytaTulokset(Tulosrivi[] rivit) {
        // Näytä tulokset
        // ...
    }
    public void lisaaTulos(Tulosrivi rivi) {
        // Näytä kaikkien kilpailijoiden tulokset
        // ...
    }
    public void tulostaTulokset() {
        Tulosrivi[] rivit = new Tulosrivi[3];
        int hyppy = Mittamies.mittaaPituus(Hyppy.getHyppy());
        int tyylipisteet = Arvostelutuomari.annaTyyliPisteet();
        String nimi = Hyppaaja.getNimi();
        System.out.println("Hyppääjän " + nimi + " hyppy oli pituudeltaan " + hyppy + " metriä ja tyylipisteet olivat " + tyylipisteet + " pistettä.");
    }
}
