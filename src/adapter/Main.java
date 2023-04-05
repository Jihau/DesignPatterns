package adapter;

// Testiohjelma
public class Main {
    public static void main(String[] args) {
        // Luodaan olemassa oleva Kolmio
        Kolmio kolmio = new Kolmio(3, 4, 5);

        // Luodaan adapteri Kolmio-luokan käyttämiseen Kuvio-rajapinnan kautta
        Kuvio adapteri = new KolmioAdapteri(kolmio);

        // Käytetään adapteria Kuvio-rajapinnan kautta
        System.out.println("Kolmion pinta-ala: " + adapteri.laskePintaAla());
        System.out.println("Kolmion keha: " + adapteri.laskeYmparysmitta());
    }
}