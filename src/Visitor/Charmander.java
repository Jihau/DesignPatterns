package Visitor;

public class Charmander extends PokemonState {
    public void attack() {
        System.out.println("Charmander uses Ember!");
    }

    public void move() {
        System.out.println("Charmander moves around.");
    }

    @Override
    public void evolve() {
    }

    public void accept(PokemonVisitor visitor) {
        visitor.visit(this);
    }
}