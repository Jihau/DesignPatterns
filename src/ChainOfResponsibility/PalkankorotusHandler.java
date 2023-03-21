package ChainOfResponsibility;

public abstract class PalkankorotusHandler {
    protected PalkankorotusHandler seuraavaHandler;

    public void setSeuraavaHandler(PalkankorotusHandler seuraavaHandler) {
        this.seuraavaHandler = seuraavaHandler;
    }

    public abstract void kasittelePyynto(Palkankorotuspyynto pyynto);
}
