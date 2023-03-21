package Memento;

public class Main {
    public static void main(String[] args) {
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        Pelaaja[] pelaajat = new Pelaaja[3];
        for (int i = 0; i < pelaajat.length; i++) {
            pelaajat[i] = new Pelaaja(arvuuttaja);
            pelaajat[i].setName("Pelaaja " + (i+1));
            pelaajat[i].start();
            System.out.println(pelaajat[i].getName() + " liittyy peliin..");
        }
    }
}
