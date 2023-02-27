package State;

public interface Pokemon {
    void attack();
    void move();
    void evolve();
    void setState(PokemonState state);
}
