package Memento;

import java.util.Random;

public class Pelaaja extends Thread {
    private final Arvuuttaja arvuuttaja;

    public Pelaaja(Arvuuttaja arvuuttaja) {
        this.arvuuttaja = arvuuttaja;
    }

    @Override
    public void run() {
        Memento memento = arvuuttaja.liityPeliin();
        //arvotaan pelaajalle random numero
        int arvaus = new Random().nextInt(10) + 1;
        boolean result = arvuuttaja.arvaaLuku(memento, arvaus, this);
        while (!result) {
            arvaus = new Random().nextInt(10) + 1;
            result = arvuuttaja.arvaaLuku(memento, arvaus, this);
        }
        System.out.println(getName() + " arvasi salaisen numeron (" + arvaus + ") oikein!");
    }
}
