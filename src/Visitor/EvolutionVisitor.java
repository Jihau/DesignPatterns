package Visitor;

public class EvolutionVisitor implements PokemonVisitor {
    public void visit(Charmander charmander) {
        System.out.println("Charmander is evolving into Charmeleon!");
        charmander.setPokemon(new Charmeleon());
    }

    public void visit(Charmeleon charmeleon) {
        System.out.println("Charmeleon is evolving into Charizard!");
        charmeleon.setPokemon(new Charizard());
    }

    public void visit(Charizard charizard) {
        System.out.println("Charizard cannot evolve any further.");
    }
}