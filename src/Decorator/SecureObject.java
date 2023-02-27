package Decorator;

public abstract class SecureObject implements Item {

    protected DataBox data;

    public SecureObject(DataBox info) {
        this.data = info;
    }

    public boolean verify(String password) {
        return password.equals("VerySecretPassword123");
    }
}