package Visitor;

public abstract class PokemonState implements Pokemon {
    protected Pokemon pokemon;

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void evolve(PokemonVisitor visitor) {
        System.out.println("Not ready to evolve yet!");
    }
}