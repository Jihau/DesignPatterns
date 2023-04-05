package adapter;

// Adapteri Kolmio-luokan käyttämiseen Kuvio-rajapinnan kautta
public class KolmioAdapteri implements Kuvio {
    private Kolmio kolmio;

    public KolmioAdapteri(Kolmio kolmio) {
        this.kolmio = kolmio;
    }

    public double laskePintaAla() {
        return kolmio.laskePintaAla();
    }

    public double laskeYmparysmitta() {
        return kolmio.laskeYmparysmitta();
    }
}