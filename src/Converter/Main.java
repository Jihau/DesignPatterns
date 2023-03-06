package Converter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);

        ListConverter normalConverter = new ListConverter(new NormalConverter());
        System.out.println("NormalConverter:");
        System.out.println(normalConverter.listToString(integers));

        ListConverter oddListConverter = new ListConverter(new OddListConverter());
        System.out.println("OddListConverter:");
        System.out.println(oddListConverter.listToString(integers));

        ListConverter trioListConverter = new ListConverter(new trioListConverter());
        System.out.println("trioListConverter:");
        System.out.println(trioListConverter.listToString(integers));
    }
}