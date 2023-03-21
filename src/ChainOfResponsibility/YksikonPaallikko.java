package ChainOfResponsibility;

public class YksikonPaallikko extends PalkankorotusHandler {

    @Override
    public void kasittelePyynto(Palkankorotuspyynto pyynto) {
        double MAX_KOROTUS = 0.05;
        if (pyynto.getKorotusprosentti() <= MAX_KOROTUS) {
            System.out.println("Yksikön päällikkö on hyväksynyt palkankorotuspyynnön");
        } else if (seuraavaHandler != null) {
            seuraavaHandler.kasittelePyynto(pyynto);
            System.out.println("Palkankorotuspyyntö oli suurempi kuin 5%, joten pyyntö siirretään toimitusjohtajalle.");
        }
    }
}