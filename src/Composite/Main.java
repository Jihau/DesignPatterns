package Composite;

public class Main {
    public static void main(String[] args) {
        Emolevy emolevy = new Emolevy(100);
        Kotelo kotelo = new Kotelo(50);
        emolevy.lisaaKomponentti(new Muistipiiri(40));
        emolevy.lisaaKomponentti(new Prosessori(80));
        emolevy.lisaaKomponentti(new Verkkokortti(20));
        kotelo.lisaaKomponentti(new Naytonohjain(60));
        Tietokone tietokone = new Tietokone(emolevy, kotelo);
        System.out.println("Tietokoneen hinta: " + tietokone.laskeHinta());
    }
}