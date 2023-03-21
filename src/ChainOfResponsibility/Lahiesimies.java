package ChainOfResponsibility;

public class Lahiesimies extends PalkankorotusHandler {

    @Override
    public void kasittelePyynto(Palkankorotuspyynto pyynto) {
        double MAX_KOROTUS = 0.02;
        if (pyynto.getKorotusprosentti() <= MAX_KOROTUS) {
            System.out.println("Lähiesimies on hyväksynyt palkankorotuspyynnön.");
        } else if (seuraavaHandler != null) {
            seuraavaHandler.kasittelePyynto(pyynto);
            System.out.println("Palkankorotuspyyntö oli suurempi kuin 2%, joten pyyntö siirretään yksikön päällikölle.");
        }
    }
}