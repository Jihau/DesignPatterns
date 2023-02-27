package State;

public class Character implements Pokemon {
    private PokemonState state;

    public Character() {
        setState(new Charmander());
    }

    public void setState(PokemonState state) {
        this.state = state;
        this.state.setPokemon(this);
    }

    public void attack() {
        this.state.attack();
    }

    public void move() {
        this.state.move();
    }

    public void evolve() {
        this.state.evolve();
    }
}
