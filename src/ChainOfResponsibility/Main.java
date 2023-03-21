package ChainOfResponsibility;

public class Main {

    public static void main(String[] args) {
        // Luodaan käsittelijät
        PalkankorotusHandler lahiesimies = new Lahiesimies();
        PalkankorotusHandler yksikonPaallikko = new YksikonPaallikko();
        PalkankorotusHandler toimitusjohtaja = new Toimitusjohtaja();

        // Yhdistetään käsittelijät Chain of Responsibility -mallilla
        lahiesimies.setSeuraavaHandler(yksikonPaallikko);
        yksikonPaallikko.setSeuraavaHandler(toimitusjohtaja);

        // Luodaan palkankorotuspyyntöjä
        Palkankorotuspyynto pyynto1 = new Palkankorotuspyynto(0.015);
        Palkankorotuspyynto pyynto2 = new Palkankorotuspyynto(0.028);
        Palkankorotuspyynto pyynto3 = new Palkankorotuspyynto(0.1);

        // Käsitellään palkankorotuspyynnöt
        System.out.println("Lähetetään ensimmäinen palkankorotuspyyntö.");
        lahiesimies.kasittelePyynto(pyynto1);
        System.out.println("Lähetetään toinen palkankorotuspyyntö.");
        lahiesimies.kasittelePyynto(pyynto2);
        System.out.println("Lähetetään kolmas palkankorotuspyyntö.");
        lahiesimies.kasittelePyynto(pyynto3);
    }
}