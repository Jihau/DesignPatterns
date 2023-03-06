package Converter;

import java.util.List;

public class ListConverter {

    ListStrategy strategy;

    public ListConverter(ListStrategy strategy) {
        this.strategy = strategy;
    }

    public String listToString(List list) {
        return strategy.listToString(list);
    }
}