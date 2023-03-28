package Visitor;

public class Main {
    public static void main(String[] args) {
        Charmander charmander = new Charmander();
        Charmeleon charmeleon = new Charmeleon();
        Charizard charizard = new Charizard();
        EvolutionVisitor evolutionVisitor = new EvolutionVisitor();

        charmander.attack();
        charmander.move();
        charmander.accept(evolutionVisitor);

        charmeleon.attack();
        charmeleon.move();
        charmeleon.accept(evolutionVisitor);

        charizard.attack();
        charizard.move();
        charizard.accept(evolutionVisitor);
    }
}