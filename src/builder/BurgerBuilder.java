package builder;

public interface BurgerBuilder {
    void addBun();
    void addPatty();
    void addCheese();
    void addLettuce();
    void addTomato();
    void addOnion();
    void addMayonnaise();
    Burger getBurger();
}
