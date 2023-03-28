package Visitor;

public interface PokemonVisitor {
    void visit(Charmander charmander);
    void visit(Charmeleon charmeleon);
    void visit(Charizard charizard);
}
