package meditator;

public class Mittamies {
    public static void mittaaHyppy(Hyppaaja hyppaaja, int indeksi) {
        // Mittaa hyppääjän hypyn pituuden ja tallenna se hyppyyn
        Hyppy hyppy = hyppaaja.getHypyt()[indeksi];
        int pituus = mittaaPituus(hyppy);
        hyppy.setPituus(pituus);
        System.out.println("Mittamies mittasi hyppääjän " + hyppaaja.getNimi() + " hypyn pituuden " + pituus + " metriin.");
    }

    static int mittaaPituus(Hyppy hyppy) {
        return hyppy.getPituus();
    }
}
