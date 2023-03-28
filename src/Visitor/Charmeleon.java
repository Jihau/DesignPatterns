package Visitor;

public class Charmeleon extends PokemonState {
    public void attack() {
        System.out.println("Charmeleon uses Flamethrower!");
    }

    public void move() {
        System.out.println("Charmeleon moves around.");
    }

    public void accept(PokemonVisitor visitor) {
        visitor.visit(this);
    }

    public void evolve() {
    }
}