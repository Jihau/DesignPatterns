package Converter;

import java.util.List;

public class trioListConverter implements ListStrategy {

    @Override
    public String listToString(List list) {
        Object[] array = new Object[list.size()];
        for (int i = 0; i < list.size(); i++) {
            if (i % 3 != 0) {
                array[i] = list.get(i);
            } else {
                array[i] = list.get(i) + "\n";
            }
        }

        String returnMe = "";
        for (Object object : array) {
            returnMe += object;
        }
        return returnMe;
    }
}