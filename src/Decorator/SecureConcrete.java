package Decorator;

public class SecureConcrete extends SecureObject {

    public SecureConcrete(DataBox data) {
        super(data);
    }

    @Override
    public void act() {
        System.out.print("Password:\n");
        if (this.verify(super.data.reader.nextLine())) {
            System.out.println(super.data.giveSecret());
        } else {
            System.out.println("Password wrong!");
        }
    }
}