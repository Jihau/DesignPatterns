package ChainOfResponsibility;

public class Toimitusjohtaja extends PalkankorotusHandler {
    @Override
    public void kasittelePyynto(Palkankorotuspyynto pyynto) {
        System.out.println("Toimitusjohtaja hyväksyi palkankorotuspyynnön.");
    }
}