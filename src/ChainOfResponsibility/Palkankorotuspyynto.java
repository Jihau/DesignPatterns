package ChainOfResponsibility;

public class Palkankorotuspyynto {
    private final double korotusprosentti;

    public Palkankorotuspyynto(double korotusprosentti) {
        this.korotusprosentti = korotusprosentti;
    }

    public double getKorotusprosentti() {
        return korotusprosentti;
    }
}