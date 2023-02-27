package Decorator;

import java.util.Scanner;

public class DataBox implements Item {
    public Scanner reader;

    public DataBox() {
        this.reader = new Scanner(System.in);
    }

    public String giveSecret() {
        return "Success!";
    }

    @Override
    public void act() {
        System.out.println(giveSecret());
    }
}