package builder;

import java.util.ArrayList;
import java.util.List;

public class Burger {
    private String components;

    public Burger(String components) {
        this.components = components;
    }

    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    @Override
    public String toString() {
        return "Hampurilainen {" +
                "taytteet='" + components + '\'' +
                '}';
    }
}