package facade;

public class CPU {
    // jäädyttää prosessorin
    public void freeze() {
        System.out.println("Freezing CPU");
    }

    // hyppää annettuun osoitteeseen
    public void jump(long position) {
        System.out.println("Jumping to position: " + position);
    }

    // suorittaa prosessorin käskyt
    public void execute() {
        System.out.println("Executing CPU instructions");
    }
}
