package Converter;

import java.util.List;

public class NormalConverter implements ListStrategy {

    @Override
    public String listToString(List list) {
        String returnMe = "";
        for (Object object : list) {
            returnMe = object.toString() + "\n";
        }
        return returnMe;
    }

}