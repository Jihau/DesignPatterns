package adapter;

// Olemassa oleva Kolmio-luokka
public class Kolmio {
    double sivu1, sivu2, sivu3;

    public Kolmio(double sivu1, double sivu2, double sivu3) {
        this.sivu1 = sivu1;
        this.sivu2 = sivu2;
        this.sivu3 = sivu3;
    }

    public double laskePintaAla() {
        double s = (sivu1 + sivu2 + sivu3) / 2;
        return Math.sqrt(s * (s - sivu1) * (s - sivu2) * (s - sivu3));
    }

    public double laskeYmparysmitta() {
        return sivu1 + sivu2 + sivu3;
    }
}