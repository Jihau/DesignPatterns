package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main extends Thread {

    // Luodaan uusi ArrayList, johon lisätään kymmenen merkkijonoa "Item i", missä i on 0-9.
    static ArrayList<String> collection = new ArrayList<String>();

    // Iterator-käytetään myöhemmin yhdessä säikeen run-metodissa
    Iterator<String> iterator2 = collection.iterator();

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            collection.add("Item " + i);
        }

        // Luo kaksi uutta säiettä, joista kummallakin on oma Main-instanssi.
        Main thread = new Main();
        Main thread2 = new Main();

        // Käynnistä molemmat säikeet.
        thread.start();
        thread2.start();
    }

    // Säikeen run-metodi. Tämä metodi kutsutaan kun säie on käynnistetty.
    // Tämä metodi suoritetaan itsenäisesti molemmissa säikeissä.
    @Override
    public void run() {

        // Säikeet synkronoidaan tässä kohtaa, jotta vain yksi säie käsittelee kokoelman kerrallaan.
        synchronized(collection) {

            // while-silmukka suoritetaan, kunnes iteraattorilla ei ole enää alkioita käsiteltävänä.
            while (iterator2.hasNext()) {

                // Tulostetaan iteraattorilla seuraava merkkijono.
                System.out.println(Thread.currentThread().getId() + " " + iterator2.next());
            }
        }
    }
}
