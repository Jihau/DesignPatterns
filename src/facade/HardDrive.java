package facade;

public class HardDrive {
    public char[] read(long lba, int size) {
        // simuloidaan lukemista
        System.out.println("Reading " + size + " bytes from LBA " + lba);
        // luodaan dataa vastaava taulukko
        char[] data = new char[size];
        // simuloidaan lukemista odottamalla 1ms per tavu (1000 tavua/s)
        for (int i = 0; i < size; i++) {
            try {
                // odotetaan 1ms
                Thread.sleep(1);
                // tulostetaan piste, jotta nähdään ohjelman eteneminen
            } catch (InterruptedException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
            // täytetään data a-kirjaimilla
            data[i] = 'a';
        }
        // tulostetaan lopuksi rivinvaihto
        return data;
    }
}
