package builder;

public class McDonaldsBuilder implements BurgerBuilder {
    private StringBuilder components = new StringBuilder();

    @Override
    public void addBun() {
        components.append("leipa, ");
    }

    @Override
    public void addPatty() {
        components.append("pihvi, ");
    }

    @Override
    public void addCheese() {
        components.append("cheddarjuusto, ");
    }

    @Override
    public void addLettuce() {
        components.append("salaatti, ");
    }

    @Override
    public void addTomato() {
        components.append("tomaattia, ");
    }

    @Override
    public void addOnion() {
        components.append("sipuli, ");
    }

    @Override
    public void addMayonese() {

    }

    @Override
    public Burger getBurger() {
        return new Burger(components.toString());
    }
}
