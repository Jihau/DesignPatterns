package State;

public abstract class PokemonState implements Pokemon {
    protected Pokemon pokemon;

    public void setState(PokemonState state) {
        this.pokemon.setState(state);
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void evolve() {
        System.out.println("Not ready to evolve yet!");
    }
}