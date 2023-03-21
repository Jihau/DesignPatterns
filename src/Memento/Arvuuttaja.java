package Memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arvuuttaja {
    private final List<Memento> mementos;
    private final int secretNumber;

    public Arvuuttaja() {
        mementos = new ArrayList<>();
        secretNumber = new Random().nextInt(10) + 1;
    }

    public Memento liityPeliin() {
        Memento memento = new Memento(secretNumber);
        mementos.add(memento);
        return memento;
    }

    public synchronized boolean arvaaLuku(Memento memento, int arvaus, Pelaaja pelaaja) {
        int luku = memento.getArvottuLuku();
        if (arvaus == luku) {
            System.out.println(pelaaja.getName() + ": Oikea arvaus!");
            return true;
        } else if (arvaus < luku) {
            System.out.println(pelaaja.getName() + ": Luku on suurempi.");
        } else {
            System.out.println(pelaaja.getName() + ": Luku on pienempi.");
        }
        System.out.println(pelaaja.getName() + ": Väärä arvaus!");
        return false;
    }
}
