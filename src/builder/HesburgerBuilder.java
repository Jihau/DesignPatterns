package builder;

import java.util.ArrayList;

public class HesburgerBuilder implements BurgerBuilder {
    private ArrayList<String> components = new ArrayList<>();

    @Override
    public void addBun() {
        components.add("Bun");
    }

    @Override
    public void addPatty() {
        components.add("Beef Patty");
    }

    @Override
    public void addCheese() {
        components.add("cheddarjuusto");
    }

    @Override
    public void addLettuce() {
        components.add("salaatti");
    }

    @Override
    public void addTomato() {
        components.add("tomaattia");
    }

    @Override
    public void addOnion() {
        components.add("sipulia");
    }

    @Override
    public void addMayonese() {
        components.add("paprikamajoneesi");
    }

    @Override
    public Burger getBurger() {
        StringBuilder builder = new StringBuilder();
        for (String component : components) {
            builder.append(component).append(", ");
        }
        return new Burger(builder.toString());
    }
}