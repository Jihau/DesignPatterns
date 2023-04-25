package facade;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;
    private static final int kBootAddress = 0;
    private static final long kBootSector = 0;
    private static final int kSectorSize = 512;

    public ComputerFacade() {
        // luodaan komponentit
        cpu = new CPU();
        memory = new Memory(1024);
        hardDrive = new HardDrive();
    }

    public void start() {
        // käynnistetään tietokone
        cpu.freeze();
        char[] bootSector = hardDrive.read(kBootSector, kSectorSize);
        memory.load(kBootAddress, bootSector);
        cpu.jump(kBootAddress);
        cpu.execute();
    }
}
