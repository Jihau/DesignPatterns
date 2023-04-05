package builder;

public class Main {
    public static void main(String[] args) {
        BurgerBuilder hesburgerBuilder = new HesburgerBuilder();
        hesburgerBuilder.addBun();
        hesburgerBuilder.addPatty();
        hesburgerBuilder.addCheese();
        hesburgerBuilder.addLettuce();
        hesburgerBuilder.addTomato();
        hesburgerBuilder.addOnion();
        hesburgerBuilder.addMayonese();
        Burger hesburgerBurger = hesburgerBuilder.getBurger();
        System.out.println(hesburgerBurger);

        BurgerBuilder mcdonaldsBuilder = new McDonaldsBuilder();
        mcdonaldsBuilder.addBun();
        mcdonaldsBuilder.addPatty();
        mcdonaldsBuilder.addCheese();
        mcdonaldsBuilder.addLettuce();
        mcdonaldsBuilder.addTomato();
        mcdonaldsBuilder.addOnion();
        Burger mcdonaldsBurger = mcdonaldsBuilder.getBurger();
        System.out.println(mcdonaldsBurger);
    }
}