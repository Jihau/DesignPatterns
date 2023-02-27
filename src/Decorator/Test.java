package Decorator;

public class Test {
    public static void main(String[] args) {
        SecureConcrete secured_box = new SecureConcrete(new DataBox());
        secured_box.act();
    }
}