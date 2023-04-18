package prototype;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Luodaan alkuperäinen kello
        HourHand hourHand = new HourHand(0);
        MinuteHand minuteHand = new MinuteHand(0);
        SecondHand secondHand = new SecondHand(0);
        Clock clock = new Clock(hourHand, minuteHand, secondHand);

        // Asetetaan kelloon aika ja tulostetaan se
        clock.setTime(new Date());
        System.out.println("Alkuperäinen kello: " + clock.toString());

        // Kloonataan kello ja asetetaan sen aika 5 minuuttia myöhemmäksi
        Clock clockClone = clock.clone();
        clockClone.tick();
        clockClone.tick();
        clockClone.tick();
        clockClone.tick();
        clockClone.tick();
        System.out.println("Klooni kello (syväkopiointi): " + clockClone.toString());
        System.out.println("Alkuperäinen kello: " + clock.toString());

        // Muutetaan alkuperäisen kellon aikaa
        clock.tick();
        System.out.println("Muutettu alkuperäinen kello: " + clock.toString());
        System.out.println("Klooni kello (syväkopiointi): " + clockClone.toString());

        // Kloonataan kello uudelleen ja asetetaan sen aika 5 minuuttia myöhemmäksi
        Clock clockShallowClone = (Clock) clock.clone();
        clockShallowClone.tick();
        clockShallowClone.tick();
        clockShallowClone.tick();
        clockShallowClone.tick();
        clockShallowClone.tick();
        System.out.println("Klooni kello (matalakopiointi): " + clockShallowClone.toString());
        System.out.println("Alkuperäinen kello: " + clock.toString());

        // Muutetaan alkuperäisen kellon aikaa
        clock.tick();
        System.out.println("Muutettu alkuperäinen kello: " + clock.toString());
        System.out.println("Klooni kello (matalakopiointi): " + clockShallowClone.toString());
    }
}